package by.melnikov.webservlets.model.entity.userbuilder;

import by.melnikov.webservlets.model.entity.User;

import java.math.BigDecimal;
import java.time.LocalDate;

public class UserBuilder extends AbstractUserBuilder {
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
        user.setRole(Role.USER);
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

    User setLastName(String lastName) {
        user.setLastName(lastName);
        return user;
    }

    User setStatus(Status status) {
        user.setStatus(status);
        return user;
    }

    User setBirthdate(LocalDate birthdate) {
        user.setBirthdate(birthdate);
        return user;
    }

    User setPhone(String phone) {
        user.setPhone(phone);
        return user;
    }

    User setBalance(BigDecimal balance) {
        user.setBalance(balance);
        return user;
    }

    User setOrdersCount(int ordersCount) {
        user.setOrdersCount(ordersCount);
        return user;
    }

    User setDiscount(int discount) {
        user.setDiscount(discount);
        return user;
    }
}
