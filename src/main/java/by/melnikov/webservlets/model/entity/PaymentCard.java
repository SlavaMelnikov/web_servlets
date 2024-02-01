package by.melnikov.webservlets.model.entity;

import java.time.LocalDate;

public class PaymentCard extends AbstractEntity {
    private final int userId;
    private final String number;
    private final String owner;
    private final LocalDate expiredDate;
    private final String bank;

    public PaymentCard(int userId, String number, String owner, LocalDate expiredDate, String bank) {
        this.userId = userId;
        this.number = number;
        this.owner = owner;
        this.expiredDate = expiredDate;
        this.bank = bank;
    }

    public int getUserId() {
        return userId;
    }

    public String getNumber() {
        return number;
    }

    public String getOwner() {
        return owner;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public String getBank() {
        return bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaymentCard that = (PaymentCard) o;

        if (userId != that.userId) return false;
        if (!number.equals(that.number)) return false;
        if (!owner.equals(that.owner)) return false;
        if (!expiredDate.equals(that.expiredDate)) return false;
        return bank.equals(that.bank);
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + number.hashCode();
        result = 31 * result + owner.hashCode();
        result = 31 * result + expiredDate.hashCode();
        result = 31 * result + bank.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "PaymentCard{" +
                "userId=" + userId +
                ", number='" + number + '\'' +
                ", owner='" + owner + '\'' +
                ", expiredDate=" + expiredDate +
                ", bank='" + bank + '\'' +
                '}';
    }
}
