package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.Bike;

import java.util.List;

public interface BikeDao extends BaseDao<Bike> {
    List<Bike> findByStatus(Bike.Status status) throws DaoException;
    List<Bike> findByType(Bike.Type type) throws DaoException;
}
