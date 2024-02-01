package by.melnikov.webservlets.model.service.impl;

import by.melnikov.webservlets.model.service.UserService;

public class UserServiceImpl implements UserService {
    private static final UserServiceImpl instance = new UserServiceImpl();

    private UserServiceImpl() {
    }

    public static UserServiceImpl getInstance() {
        return instance;
    }

}
