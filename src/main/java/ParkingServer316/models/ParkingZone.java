package ParkingServer316.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.springframework.core.SpringVersion;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="parking_zones")

public class ParkingZone {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "council_zone_identifier")
    private String councilZoneIdentifier;

    @Column(name = "price")
    private int price;

    @OneToMany
    @JsonIgnoreProperties({"parkingZones"})
    private List<ParkingSpot> parkingSpots;

    @Column(name = "description")
    private String description;

    @Column(name = "public_spaces")
    private int publicSpaces;

    @Column(name = "permit_spaces")
    private int permitSpaces;

    @Column(name = "off_street_spaces")
    private int offStreetSpaces;

    public ParkingZone(long id, String councilZoneIdentifier, int price, String description, int publicSpaces, int permitSpaces, int offStreetSpaces) {
        this.id = id;
        this.councilZoneIdentifier = councilZoneIdentifier;
        this.price = price;
        this.parkingSpots = new ArrayList<>(); // Corrected field name
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

//    public void setId(long id) {
//        this.id = id;
//    }

    public String getCouncilZoneIdentifier() {
        return councilZoneIdentifier;
    }

//    public void setCouncilZoneIdentifier(String councilZoneIdentifier) {
//        this.councilZoneIdentifier = councilZoneIdentifier;
//    }

    public int getPrice() {
        return price;
    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

//    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
//        this.parkingSpots = parkingSpots;
//    }

    public String getDescription() {
        return description;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public int getPublicSpaces() {
        return publicSpaces;
    }

//    public void setPublicSpaces(int publicSpaces) {
//        this.publicSpaces = publicSpaces;
//    }

    public int getPermitSpaces() {
        return permitSpaces;
    }

//    public void setPermitSpaces(int permitSpaces) {
//        this.permitSpaces = permitSpaces;
//    }

    public int getOffStreetSpaces() {
        return offStreetSpaces;
    }

//    public void setOffStreetSpaces(int offStreetSpaces) {
//        this.offStreetSpaces = offStreetSpaces;
//    }
}
