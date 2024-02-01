package by.melnikov.webservlets.model.entity.userbuilder;

import by.melnikov.webservlets.model.entity.User;

public abstract class AbstractUserBuilder {
    User user;

    abstract User setUserId(int id);
    abstract User setLogin(String login);
    abstract User setRole();
    abstract User setEmail(String email);
    abstract User setName(String name);

    public User build() {
        return user;
    }
}
