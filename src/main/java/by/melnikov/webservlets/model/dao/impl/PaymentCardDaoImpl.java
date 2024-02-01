package by.melnikov.webservlets.model.dao.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.dao.PaymentCardDao;
import by.melnikov.webservlets.model.entity.PaymentCard;

import java.util.List;

public class PaymentCardDaoImpl implements PaymentCardDao {
    @Override
    public boolean insert(PaymentCard paymentCard) throws DaoException {
        return false;
    }

    @Override
    public PaymentCard findById(int id) throws DaoException {
        return null;
    }

    @Override
    public List<PaymentCard> findAll() throws DaoException {
        return null;
    }

    @Override
    public PaymentCard update(PaymentCard paymentCard) throws DaoException {
        return null;
    }

    @Override
    public boolean delete(PaymentCard paymentCard) throws DaoException {
        return false;
    }

    @Override
    public List<PaymentCard> findExpiredCards() throws DaoException {
        return null;
    }
}
