package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.connection.ConnectionPool;
import by.melnikov.webservlets.model.dao.UserDao;
import by.melnikov.webservlets.model.entity.User;

import java.sql.*;
import java.time.LocalDate;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private static final String LOGIN_USER = "SELECT password FROM users WHERE login = ?";
    private static final String FIND_USERS_BY_BIRTHDATE = "SELECT user FROM users WHERE birthdate = ?";
    private static final String FIND_USER_BY_ORDERS_COUNT = "SELECT user FROM users WHERE orders_count = ?";
    private static final String FIND_USER_BY_ID = "SELECT login FROM users WHERE user_id = ?";
    private static final UserDaoImpl INSTANCE = new UserDaoImpl();

    private UserDaoImpl() {
    }

    public static UserDaoImpl getInstance() {
        return INSTANCE;
    }

    @Override
    public boolean login(String login, String password) {
        boolean isValidUser = false;
        try (Connection connection = ConnectionPool.INSTANCE.getConnection();
             Statement statement = connection.createStatement()) {

            String query = "SELECT password FROM users WHERE login = '" + login + "'";
            ResultSet resultSet = statement.executeQuery(query);
            resultSet.next();
            String dbPassword = resultSet.getString("password");
            if (dbPassword.equals(password)) {
                isValidUser = true;
                return isValidUser;
            }
        } catch (SQLException e) {
            throw new RuntimeException();
        }
        return isValidUser;
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
        User user = new User();
        try (Connection connection = ConnectionPool.INSTANCE.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(FIND_USER_BY_ID);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            preparedStatement.setInt(1, 2);
            resultSet.next();
            user.setUserId(resultSet.getInt(1));
            user.setLogin(resultSet.getString(2));
        } catch (SQLException e) {
        }
        return user;
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
