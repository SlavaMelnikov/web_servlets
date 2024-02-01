package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.dao.ParkingPointDao;
import by.melnikov.webservlets.model.entity.ParkingPoint;

import java.util.List;

public class ParkingPointDaoImpl implements ParkingPointDao {
    @Override
    public boolean insert(ParkingPoint parkingPoint) throws DaoException {
        return false;
    }

    @Override
    public ParkingPoint findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<ParkingPoint> findAll() throws DaoException {
        return null;
    }

    @Override
    public ParkingPoint update(ParkingPoint parkingPoint) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(ParkingPoint parkingPoint) throws DaoException {
        return false;
    }

    @Override
    public List<ParkingPoint> findByStatus(ParkingPoint.Status status) throws DaoException {
        return null;
    }

    @Override
    public List<ParkingPoint> findByCity(String city) throws DaoException {
        return null;
    }
}
