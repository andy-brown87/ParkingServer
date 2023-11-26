package ParkingServer316.models;


import jakarta.persistence.*;

import java.util.List;

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

    public ParkingSpot(long id, ParkingZone parkingZone, String bayType, long councilBayIdentifier) {
        this.id = id;
        this.parkingZone = parkingZone;
        this.bayType = bayType;
        this.councilBayIdentifier = councilBayIdentifier;
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
}
