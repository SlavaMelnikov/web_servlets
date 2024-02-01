package by.melnikov.webservlets.model.entity;

public class ParkingPoint extends AbstractEntity {
    public enum Status {
        OPEN, CLOSED
    }

    private final int parkingPointId;
    private final String city;
    private final String street;
    private final String buildingNumber;
    private Status status;

    public ParkingPoint(int parkingPointId, String city, String street, String buildingNumber, Status status) {
        this.parkingPointId = parkingPointId;
        this.city = city;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.status = status;
    }

    public int getParkingPointId() {
        return parkingPointId;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ParkingPoint that = (ParkingPoint) o;

        if (parkingPointId != that.parkingPointId) return false;
        if (!city.equals(that.city)) return false;
        if (!street.equals(that.street)) return false;
        if (!buildingNumber.equals(that.buildingNumber)) return false;
        return status == that.status;
    }

    @Override
    public int hashCode() {
        int result = parkingPointId;
        result = 31 * result + city.hashCode();
        result = 31 * result + street.hashCode();
        result = 31 * result + buildingNumber.hashCode();
        result = 31 * result + status.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "ParkingPoint{" +
                "parkingPointId=" + parkingPointId +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber='" + buildingNumber + '\'' +
                ", status=" + status +
                '}';
    }
}
