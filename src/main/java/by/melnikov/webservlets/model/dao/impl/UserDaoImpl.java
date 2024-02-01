package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.connection.ConnectionPool;
import by.melnikov.webservlets.model.dao.UserDao;
import by.melnikov.webservlets.model.entity.User;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static final String LOGIN_USER = "SELECT password FROM users WHERE login = ?";
    private static final String FIND_USER_BY_ID = "SELECT * FROM users WHERE user_id = ?";
    private static final UserDaoImpl INSTANCE = new UserDaoImpl();

    private UserDaoImpl() {
    }

    public static UserDaoImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean authenticate(String login, String password) throws DaoException {
        boolean isAuthenticateSuccessful = false;
        try (Connection connection = ConnectionPool.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(LOGIN_USER)) {
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            String passwordFromDatabase = resultSet.getString("password");
            if (password.equals(passwordFromDatabase)) {
                isAuthenticateSuccessful = true;
            }
        } catch (SQLException e) {
            throw new DaoException(e.getMessage(), e);
        }
        return isAuthenticateSuccessful;
    }


    @Override
    public List<User> findUsersByBirthdate(LocalDate birthdate) throws DaoException {
        return null;
    }

    @Override
    public List<User> findUsersByOrdersCount(int ordersCount) throws DaoException {
        return null;
    }

    @Override
    public boolean insert(User user) throws DaoException {
        return false;
    }

    @Override
    public User findById(int id) throws DaoException {
        try (Connection connection = ConnectionPool.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_ID)) {
            preparedStatement.setInt(1, 2);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
        } catch (SQLException e) {
            throw new DaoException(e.getMessage(), e);
        }
        return null; //todo
    }

    @Override
    public List<User> findAll() throws DaoException {
        return null;
    }

    @Override
    public User update(User user) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(User user) throws DaoException {
        return false;
    }

}
