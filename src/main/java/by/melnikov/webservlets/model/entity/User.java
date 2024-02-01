package by.melnikov.webservlets.model.entity;

import by.melnikov.webservlets.model.entity.userbuilder.Role;
import by.melnikov.webservlets.model.entity.userbuilder.Status;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class User extends AbstractEntity {

    private int userId;
    private String login;
    private Role role;
    private Status status;
    private String email;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private String phone;
    private BigDecimal balance;
    private int ordersCount;
    private int discount;

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(int ordersCount) {
        this.ordersCount = ordersCount;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (ordersCount != user.ordersCount) return false;
        if (discount != user.discount) return false;
        if (!login.equals(user.login)) return false;
        if (role != user.role) return false;
        if (status != user.status) return false;
        if (!email.equals(user.email)) return false;
        if (!name.equals(user.name)) return false;
        if (!Objects.equals(lastName, user.lastName)) return false;
        if (!Objects.equals(birthdate, user.birthdate)) return false;
        if (!Objects.equals(phone, user.phone)) return false;
        return Objects.equals(balance, user.balance);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + login.hashCode();
        result = 31 * result + (role != null ? role.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + email.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (balance != null ? balance.hashCode() : 0);
        result = 31 * result + ordersCount;
        result = 31 * result + discount;
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", login='" + login + '\'' +
                ", role=" + role +
                ", status=" + status +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", ordersCount=" + ordersCount +
                ", discount=" + discount +
                '}';
    }
}
