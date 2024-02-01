package by.melnikov.webservlets.model.connection;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

//import static by.melnikov.webservlets.model.connection.DatabaseParameters.CONNECTION_POOL_DEFAULT_SIZE;

public enum ConnectionPool {
    INSTANCE;

    private final Logger logger = LogManager.getLogger();
    private static final int CONNECTION_POOL_DEFAULT_SIZE = 16;
    private BlockingQueue<Connection> availableConnections;
    private Queue<Connection> usedConnections;

    ConnectionPool() {
        availableConnections = new LinkedBlockingQueue<>(CONNECTION_POOL_DEFAULT_SIZE);
        usedConnections = new ArrayDeque<>(CONNECTION_POOL_DEFAULT_SIZE);
        for (int i = 0; i < CONNECTION_POOL_DEFAULT_SIZE; i++) {
            Connection connection = ConnectionFactory.createConnection();
            if (connection == null) {
                continue;
            }
            Connection proxyConnection = new ProxyConnection(connection);
            availableConnections.add(proxyConnection);
        }
        checkPoolState();
    }

    private void checkPoolState() {
        if (availableConnections.size() == CONNECTION_POOL_DEFAULT_SIZE) {
            logger.log(Level.INFO, "Connection pool was successfully created.");
        } else if (availableConnections.size() < CONNECTION_POOL_DEFAULT_SIZE) {
            createMissingConnections(CONNECTION_POOL_DEFAULT_SIZE - availableConnections.size());
        } else if (availableConnections.isEmpty()) {
            logger.log(Level.FATAL, "Not a single connection was created.");
            throw new ExceptionInInitializerError("Not a single connection was created.");
        }
    }

    private void createMissingConnections(int countOfNotCreatedConnections) {
        for (int i = 0; i < countOfNotCreatedConnections; i++) {
            Connection connection = ConnectionFactory.createConnection();
            if (connection == null) {
                continue;
            }
            Connection proxyConnection = new ProxyConnection(connection);
            availableConnections.add(proxyConnection);
        }
    }

    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = availableConnections.take();
            usedConnections.add(connection);
        } catch (InterruptedException e) {
            logger.log(Level.ERROR, "Current thread was interrupted");
            Thread.currentThread().interrupt();
        }
        return connection;
    }

    public boolean releaseConnection(Connection connection) {
        boolean isProxy;
        if (ProxyConnection.class == connection.getClass()) {
            usedConnections.remove(connection);
            availableConnections.add(connection);
            isProxy = true;
        } else {
            logger.log(Level.WARN, "Attempting to add \"wild\" connection.");
            isProxy = false;
        }
        return isProxy;
    }

    public void destroyPool() {
        int notClosed = 0;
        for (int i = 0; i < CONNECTION_POOL_DEFAULT_SIZE; i++) {
            try {
                availableConnections.take().close();
            } catch (SQLException e) {
                logger.log(Level.ERROR, "Problem with closing connection: " + e.getMessage());
                notClosed++;
            } catch (InterruptedException e) {
                logger.log(Level.WARN, "Current thread was interrupted");
                Thread.currentThread().interrupt();
            }
        }
        if (notClosed == 0) {
            logger.log(Level.INFO, "Connection pool was successfully destroyed.");
        } else {
            logger.log(Level.WARN, "Connection pool was destroyed, but " + notClosed + " connections were not properly closed.");
        }
        deregisterDrivers();
    }

    private void deregisterDrivers(){
        DriverManager.drivers().forEach(driver -> {
            try {
                DriverManager.deregisterDriver(driver);
            } catch (SQLException e) {
                logger.log(Level.ERROR, "Error during driver deregister: " + e.getMessage());
            }
        });
    }
}
