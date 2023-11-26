package ParkingServer316.models;


import jakarta.persistence.*;

@Entity
@Table(name="BicycleSpots")


public class BicycleSpot {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "council_identifier")
    private String councilIdentifier;

    @Column(name = "capacity")
    private String capacity;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    public BicycleSpot(long id, String councilIdentifier, String capacity, String latitude, String longitude) {
        this.id = id;
        this.councilIdentifier = councilIdentifier;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public BicycleSpot() {
    }

    public long getId() {
        return id;
    }

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getCouncil_identifier() {
        return councilIdentifier;
    }

//    public void setCouncil_identifier(String council_identifier) {
//        this.councilIdentifier = council_identifier;
//    }

    public String getCapacity() {
        return capacity;
    }

//    public void setCapacity(String capacity) {
//        this.capacity = capacity;
//    }

    public String getLatitude() {
        return latitude;
    }

//    public void setLatitude(String latitude) {
//        this.latitude = latitude;
//    }

    public String getLongitude() {
        return longitude;
    }

//    public void setLongitude(String longitude) {
//        this.longitude = longitude;
//    }
}
