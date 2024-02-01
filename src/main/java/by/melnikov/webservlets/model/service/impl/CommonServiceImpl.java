package by.melnikov.webservlets.model.service.impl;

import by.melnikov.webservlets.exception.DaoException;
import by.melnikov.webservlets.exception.ServiceException;
import by.melnikov.webservlets.model.dao.UserDao;
import by.melnikov.webservlets.model.dao.impl.UserDaoImpl;
import by.melnikov.webservlets.model.entity.User;
import by.melnikov.webservlets.model.service.CommonService;

public class CommonServiceImpl implements CommonService {
    private static final String LOGIN_TEMPLATE_REGEX = "^[a-z0-9_-]{3,16}$";
    private static final String PASSWORD_TEMPLATE_REGEX = "^\\S{3,20}$";
    private static final String NAME_TEMPLATE_REGEX = "\\w{2, 45}";
    private static final String LASTNAME_TEMPLATE_REGEX = "\\w{2, 45}";
    private static final String EMAIL_TEMPLATE_REGEX = "^[A-Z0-9._%+-]+@[A-Z0-9-]+.+.[A-Z]{2,4}$";
    private static final String PHONE_TEMPLATE_REGEX = "^\\+?(\\d{1,3})?[- .]?\\(?(?:\\d{2,3})\\)?[- .]?\\d\\d\\d[- .]?\\d\\d\\d\\d$";
    private static final String BIRTHDATE_TEMPLATE_REGEX = "^(0[1-9]|[12][0-9]|3[01])[.](0[1-9]|1[012])[.](19|20)\\d\\d$";
    private static final CommonServiceImpl instance = new CommonServiceImpl();

    private CommonServiceImpl() {
    }

    public static CommonServiceImpl getInstance() {
        return instance;
    }

    @Override
    public User registration() throws ServiceException {
        return null;
    }

    @Override
    public boolean authenticate(String login, String password) throws ServiceException {
//        validate authenticate, password, шифрование + md5. Если не проходит, сразу false
        UserDao userDao = UserDaoImpl.getInstance();
        boolean match = false;
        try {
            match = userDao.authenticate(login, password);
        } catch (DaoException e) {
            throw new ServiceException(e.getMessage(), e);
        }
        return match;
    }

    @Override
    public void logout() throws ServiceException {

    }

    @Override
    public boolean changeEmail(String newEmail) throws ServiceException {
        return false;
    }

    @Override
    public boolean changeLogin(String newLogin) throws ServiceException {
        return false;
    }

    @Override
    public boolean changeName(String newName) throws ServiceException {
        return false;
    }

    @Override
    public boolean changeLastName(String newLastName) throws ServiceException {
        return false;
    }

    @Override
    public boolean changePhone(String newPhone) throws ServiceException {
        return false;
    }
}
