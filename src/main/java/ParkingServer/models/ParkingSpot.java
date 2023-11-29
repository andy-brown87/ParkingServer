package ParkingServer.models;


import jakarta.persistence.*;

@Entity
@Table(name="parking_spots")

public class ParkingSpot {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "parking_zone_id")
    private Integer parkingZoneId;


    @Column(name = "bay_type")
    private String bayType;

    @Column(name = "council_bay_identifier")
    private long councilBayIdentifier;

    @Column(name = "default_latitude")
    private String defaultLatitude;

    @Column(name = "default_longitude")
    private String defaultLongitude;

    @Column(name = "price")
    private long price;



    public ParkingSpot() {
    }

    public ParkingSpot(long id, Integer parkingZoneId, String bayType, long councilBayIdentifier, String defaultLatitude, String defaultLongitude, long price) {
        this.id = id;
        this.parkingZoneId = parkingZoneId;
        this.bayType = bayType;
        this.councilBayIdentifier = councilBayIdentifier;
        this.defaultLatitude = defaultLatitude;
        this.defaultLongitude = defaultLongitude;
        this.price = price;
    }

    public long getId() {
        return id;
    }



    public Integer getParkingZoneId() {
        return parkingZoneId;
    }

    public String getBayType() {
        return bayType;
    }

    public long getCouncilBayIdentifier() {
        return councilBayIdentifier;
    }

    public String getDefaultLatitude() {
        return defaultLatitude;
    }

    public String getDefaultLongitude() {
        return defaultLongitude;
    }

    public long getPrice() {
        return price;
    }
}
