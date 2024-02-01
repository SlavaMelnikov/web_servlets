package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.AbstractEntity;

import java.util.List;

public interface BaseDao<T extends AbstractEntity> {
    boolean insert(T t) throws DaoException;
    T findById(int id) throws DaoException;
    List<T> findAll() throws DaoException;
    T update(T t) throws DaoException;
    boolean delete(T t) throws DaoException;

}
