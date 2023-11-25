package ParkingServer316.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="ParkingSpot")

public class ParkingSpot {

    @Id

    @Column(name = "id")
    private long id;

    @OneToMany(mappedBy = "vehicle_id")
    private List<ParkingZone> parkingzone;


    @OneToMany(mappedBy = "parkingSpot", fetch = FetchType.LAZY)
    private List<ParkingZone> parkingZones;


    @Column(name = "bay_type")
    private String bayType;

    @Column(name = "council_bay_identifier")
    private long councilBayIdentifier;

    public ParkingSpot(long id, List<ParkingZone> parkingzone, List<ParkingZone> parkingZones, String bayType, long councilBayIdentifier) {
        this.id = id;
        this.parkingzone = parkingzone;
        this.parkingZones = parkingZones;
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

    public List<ParkingZone> getParkingzone() {
        return parkingzone;
    }

    public void setParkingzone(List<ParkingZone> parkingzone) {
        this.parkingzone = parkingzone;
    }

    public List<ParkingZone> getParkingZones() {
        return parkingZones;
    }

    public void setParkingZones(List<ParkingZone> parkingZones) {
        this.parkingZones = parkingZones;
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
