package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.dao.FeedbackDao;
import by.melnikov.webservlets.model.entity.Feedback;

import java.util.List;

public class FeedbackDaoImpl implements FeedbackDao {
    @Override
    public boolean insert(Feedback feedback) throws DaoException {
        return false;
    }

    @Override
    public Feedback findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<Feedback> findAll() throws DaoException {
        return null;
    }

    @Override
    public Feedback update(Feedback feedback) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(Feedback feedback) throws DaoException {
        return false;
    }

    @Override
    public List<Feedback> findByStars(Feedback.Stars stars) throws DaoException {
        return null;
    }
}
