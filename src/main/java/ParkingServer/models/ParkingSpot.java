package ParkingServer.models;


import jakarta.persistence.*;

@Entity
@Table(name="parking_spots")

public class ParkingSpot {

    @Id

    @Column(name = "id")
    private long id;

    @ManyToOne
    @JoinColumn(name = "parking_zone_id")
    private ParkingZone parkingZone;


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

    public ParkingSpot(long id, ParkingZone parkingZone, String bayType, long councilBayIdentifier, String defaultLatitude, String defaultLongitude) {
        this.id = id;
        this.parkingZone = parkingZone;
        this.bayType = bayType;
        this.councilBayIdentifier = councilBayIdentifier;
        this.defaultLatitude = defaultLatitude;
        this.defaultLongitude = defaultLongitude;
        this.price = price;
    }

    public ParkingSpot() {
    }

    public long getId() {
        return id;
    }

    public ParkingZone getParkingZone() {
        return parkingZone;
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
