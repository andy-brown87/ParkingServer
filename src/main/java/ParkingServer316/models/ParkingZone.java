package ParkingServer316.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.util.List;

@Entity
@Table(name="ParkingZone")

public class ParkingZone {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "council_zone_identifier")
    private long councilZoneIdentifier;

    @Column(name = "price")
    private int price;



    @ManyToOne
    @JoinColumn(name = "parkingSpot_id", nullable = false)
    @JsonIgnoreProperties({"parkingZones"})
    private ParkingZone parkingZone;

    @Column(name = "description")
    private String description;

    @Column(name = "public_spaces")
    private int publicSpaces;

    @Column(name = "permit_spaces")
    private int permitSpaces;

    @Column(name = "off_street_spaces")
    private int offStreetSpaces;

    public ParkingZone(long id, long councilZoneIdentifier, int price, ParkingZone parkingZone, String description, int publicSpaces, int permitSpaces, int offStreetSpaces) {
        this.id = id;
        this.councilZoneIdentifier = councilZoneIdentifier;
        this.price = price;
        this.parkingZone = parkingZone;
        this.description = description;
        this.publicSpaces = publicSpaces;
        this.permitSpaces = permitSpaces;
        this.offStreetSpaces = offStreetSpaces;
    }

    public ParkingZone() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCouncilZoneIdentifier() {
        return councilZoneIdentifier;
    }

    public void setCouncilZoneIdentifier(long councilZoneIdentifier) {
        this.councilZoneIdentifier = councilZoneIdentifier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ParkingZone getParkingZone() {
        return parkingZone;
    }

    public void setParkingZone(ParkingZone parkingZone) {
        this.parkingZone = parkingZone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPublicSpaces() {
        return publicSpaces;
    }

    public void setPublicSpaces(int publicSpaces) {
        this.publicSpaces = publicSpaces;
    }

    public int getPermitSpaces() {
        return permitSpaces;
    }

    public void setPermitSpaces(int permitSpaces) {
        this.permitSpaces = permitSpaces;
    }

    public int getOffStreetSpaces() {
        return offStreetSpaces;
    }

    public void setOffStreetSpaces(int offStreetSpaces) {
        this.offStreetSpaces = offStreetSpaces;
    }
}
