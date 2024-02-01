package by.melnikov.webservlets.model.service;

import by.melnikov.webservlets.exception.ServiceException;
import by.melnikov.webservlets.model.entity.User;

public interface CommonService {
    User registration() throws ServiceException;
    boolean login(String login, String password);
    void logout();
    boolean changeEmail(String newEmail);
    boolean changeLogin(String newLogin);
    boolean changeName(String newName);
    boolean changeLastName(String newLastName);
    boolean changePhone(String newPhone);
}
