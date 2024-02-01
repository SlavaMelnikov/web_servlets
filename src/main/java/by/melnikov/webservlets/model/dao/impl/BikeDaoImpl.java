package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.dao.BikeDao;
import by.melnikov.webservlets.model.entity.Bike;

import java.util.List;

public class BikeDaoImpl implements BikeDao {
    @Override
    public boolean insert(Bike bike) throws DaoException {
        return false;
    }

    @Override
    public Bike findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<Bike> findAll() throws DaoException {
        return null;
    }

    @Override
    public Bike update(Bike bike) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(Bike bike) throws DaoException {
        return false;
    }

    @Override
    public List<Bike> findByStatus(Bike.Status status) throws DaoException {
        return null;
    }

    @Override
    public List<Bike> findByType(Bike.Type type) throws DaoException {
        return null;
    }
}
