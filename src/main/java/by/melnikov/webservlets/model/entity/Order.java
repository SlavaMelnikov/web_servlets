package by.melnikov.webservlets.model.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order extends AbstractEntity {
    private final int orderId;
    private final int userId;
    private final int bikeNumber;
    private final LocalDateTime orderStart;
    private final LocalDateTime orderEnd;
    private final BigDecimal price;

    public Order(int orderId, int userId, int bikeNumber, LocalDateTime orderStart, LocalDateTime orderEnd, BigDecimal price) {
        this.orderId = orderId;
        this.userId = userId;
        this.bikeNumber = bikeNumber;
        this.orderStart = orderStart;
        this.orderEnd = orderEnd;
        this.price = price;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getUserId() {
        return userId;
    }

    public int getBikeNumber() {
        return bikeNumber;
    }

    public LocalDateTime getOrderStart() {
        return orderStart;
    }

    public LocalDateTime getOrderEnd() {
        return orderEnd;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderId != order.orderId) return false;
        if (userId != order.userId) return false;
        if (bikeNumber != order.bikeNumber) return false;
        if (!orderStart.equals(order.orderStart)) return false;
        if (!orderEnd.equals(order.orderEnd)) return false;
        return price.equals(order.price);
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + userId;
        result = 31 * result + bikeNumber;
        result = 31 * result + orderStart.hashCode();
        result = 31 * result + orderEnd.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", userId=" + userId +
                ", bikeNumber=" + bikeNumber +
                ", orderStart=" + orderStart +
                ", orderEnd=" + orderEnd +
                ", price=" + price +
                '}';
    }
}
