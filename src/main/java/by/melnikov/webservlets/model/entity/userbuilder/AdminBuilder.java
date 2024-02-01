package by.melnikov.webservlets.model.entity.userbuilder;

import by.melnikov.webservlets.model.entity.User;

public class AdminBuilder extends AbstractUserBuilder {

    @Override
    User setUserId(int id) {
        user.setUserId(id);
        return user;
    }
    @Override
    User setLogin(String login) {
        user.setLogin(login);
        return user;
    }

    @Override
    User setRole() {
        user.setRole(Role.ADMIN);
        return user;
    }

    @Override
    User setEmail(String email) {
        user.setEmail(email);
        return user;
    }

    @Override
    User setName(String name) {
        user.setName(name);
        return user;
    }
}
