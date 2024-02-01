package by.melnikov.webservlets.model.service;

import by.melnikov.webservlets.exception.ServiceException;
import by.melnikov.webservlets.model.entity.User;

public interface CommonService {
    User registration() throws ServiceException;
    boolean authenticate(String login, String password) throws ServiceException;
    void logout() throws ServiceException;
    boolean changeEmail(String newEmail) throws ServiceException;
    boolean changeLogin(String newLogin) throws ServiceException;
    boolean changeName(String newName) throws ServiceException;
    boolean changeLastName(String newLastName) throws ServiceException;
    boolean changePhone(String newPhone) throws ServiceException;
}
