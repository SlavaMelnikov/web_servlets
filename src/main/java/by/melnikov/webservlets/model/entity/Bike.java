package by.melnikov.webservlets.model.entity;

public class Bike extends AbstractEntity {
    public enum Type {
        KID, CITY, SPORT, MOUNTAIN
    }

    public enum Status {
        AVAILABLE, ORDERED, IN_SERVICE, UTILIZED
    }

    private final int bikeNumber;
    private final String model;
    private final Type type;
    private Status status;
    private int parkingPointId;

    public Bike(int bikeNumber, String model, Type type, Status status, int parkingPointId) {
        this.bikeNumber = bikeNumber;
        this.model = model;
        this.type = type;
        this.status = status;
        this.parkingPointId = parkingPointId;
    }

    public int getBikeNumber() {
        return bikeNumber;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getParkingPointId() {
        return parkingPointId;
    }

    public void setParkingPointId(int parkingPointId) {
        this.parkingPointId = parkingPointId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bike bike = (Bike) o;

        if (bikeNumber != bike.bikeNumber) return false;
        if (parkingPointId != bike.parkingPointId) return false;
        if (!model.equals(bike.model)) return false;
        if (type != bike.type) return false;
        return status == bike.status;
    }

    @Override
    public int hashCode() {
        int result = bikeNumber;
        result = 31 * result + model.hashCode();
        result = 31 * result + type.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + parkingPointId;
        return result;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "bikeNumber=" + bikeNumber +
                ", model='" + model + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", parkingPointId=" + parkingPointId +
                '}';
    }
}
