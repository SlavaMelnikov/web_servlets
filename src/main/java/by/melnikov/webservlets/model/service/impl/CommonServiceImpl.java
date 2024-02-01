package by.melnikov.webservlets.model.service.impl;

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
    public User registration() {
        return null;
    }

    @Override
    public boolean login(String login, String password) {
//        validate login, password, шифрование + md5. Если не проходит, сразу false
        UserDao userDao = UserDaoImpl.getInstance();
        boolean match = userDao.login(login, password);
        return match;
    }

    @Override
    public void logout() {

    }

    @Override
    public boolean changeEmail(String newEmail) {
        return false;
    }

    @Override
    public boolean changeLogin(String newLogin) {
        return false;
    }

    @Override
    public boolean changeName(String newName) {
        return false;
    }

    @Override
    public boolean changeLastName(String newLastName) {
        return false;
    }

    @Override
    public boolean changePhone(String newPhone) {
        return false;
    }
}
