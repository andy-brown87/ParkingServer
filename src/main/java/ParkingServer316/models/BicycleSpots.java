package ParkingServer316.models;


import jakarta.persistence.*;

@Entity
@Table(name="BicycleSpots")


public class BicycleSpots {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "council_identifier")
    private String councilIdentifier;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;

    public BicycleSpots(long id, String councilIdentifier, String capacity, long latitude, long longitude) {
        this.id = id;
        this.councilIdentifier = councilIdentifier;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BicycleSpots() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCouncil_identifier() {
        return councilIdentifier;
    }

    public void setCouncil_identifier(String council_identifier) {
        this.councilIdentifier = council_identifier;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
