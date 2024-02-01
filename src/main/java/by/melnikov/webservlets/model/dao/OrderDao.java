package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.Order;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface OrderDao extends BaseDao<Order> {
    List<Order> findByPrice(BigDecimal price) throws DaoException;
    List<Order> findByDate(LocalDate date) throws DaoException;
}
