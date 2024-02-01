package by.melnikov.webservlets.model.entity;

public class Feedback extends AbstractEntity {
    public enum Stars {
        ONE, TWO, THREE, FOUR, FIVE
    }

    private final int orderId;
    private final Stars stars;
    private final String review;

    public Feedback(int orderId, Stars stars, String review) {
        this.orderId = orderId;
        this.stars = stars;
        this.review = review;
    }

    public int getOrderId() {
        return orderId;
    }

    public Stars getStars() {
        return stars;
    }

    public String getReview() {
        return review;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feedback feedback = (Feedback) o;

        if (orderId != feedback.orderId) return false;
        if (stars != feedback.stars) return false;
        return review.equals(feedback.review);
    }

    @Override
    public int hashCode() {
        int result = orderId;
        result = 31 * result + stars.hashCode();
        result = 31 * result + review.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "orderId=" + orderId +
                ", stars=" + stars +
                ", review='" + review + '\'' +
                '}';
    }
}
