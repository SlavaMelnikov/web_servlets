package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface UserDao extends BaseDao<User> {
    List<User> findUsersByBirthdate(LocalDate birthdate) throws DaoException;
    List<User> findUsersByOrdersCount(int ordersCount) throws DaoException;
    boolean login(String login, String password);
}
