package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.Feedback;

import java.util.List;

public interface FeedbackDao extends BaseDao<Feedback> {
    List<Feedback> findByStars(Feedback.Stars stars) throws DaoException;
}
