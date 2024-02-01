package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.dao.OrderDao;
import by.melnikov.webservlets.model.entity.Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class OrderDaoImpl implements OrderDao {
    @Override
    public boolean insert(Order order) throws DaoException {
        return false;
    }

    @Override
    public Order findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<Order> findAll() throws DaoException {
        return null;
    }

    @Override
    public Order update(Order order) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(Order order) throws DaoException {
        return false;
    }

    @Override
    public List<Order> findByPrice(BigDecimal price) throws DaoException {
        return null;
    }

    @Override
    public List<Order> findByDate(LocalDate date) throws DaoException {
        return null;
    }
}
