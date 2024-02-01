package by.melnikov.webservlets.model.dao;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.model.entity.PaymentCard;

import java.util.List;

public interface PaymentCardDao extends BaseDao<PaymentCard> {
    List<PaymentCard> findExpiredCards() throws DaoException;
}
