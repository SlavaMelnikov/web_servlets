package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.ParkingPoint;

import java.util.List;

public interface ParkingPointDao extends BaseDao<ParkingPoint> {
    List<ParkingPoint> findByStatus(ParkingPoint.Status status) throws DaoException;
    List<ParkingPoint> findByCity(String city) throws DaoException;
}
