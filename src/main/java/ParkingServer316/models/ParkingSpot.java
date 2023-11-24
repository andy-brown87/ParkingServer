package ParkingServer316.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ParkingSpots")

public class ParkingSpot {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "vehicle_id")
    private long vehicleId;

    @OneToMany(mappedBy = "ParkingZone")
    private List<ParkingSpot> parkingSpots;

    @Column(name = "bay_type")
    private String bayType;

    @Column(name = "council_bay_identifier")
    private long councilBayIdentifier;

    public ParkingSpot(long id, long vehicleId, String bayType, long councilBayIdentifier) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.bayType = bayType;
        this.councilBayIdentifier = councilBayIdentifier;
    }

    public ParkingSpot() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    public String getBayType() {
        return bayType;
    }

    public void setBayType(String bayType) {
        this.bayType = bayType;
    }

    public long getCouncilBayIdentifier() {
        return councilBayIdentifier;
    }

    public void setCouncilBayIdentifier(long councilbayIdentifier) {
        this.councilBayIdentifier = councilbayIdentifier;
    }
}
