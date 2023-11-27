package ParkingServer.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

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

    @ManyToOne
    @JoinColumn(name = "hours_id", nullable=false)
    @JsonIgnoreProperties({"hours"})
    private Hours hours;

    @Column(name = "description")
    private String description;

    @Column(name = "public_spaces")
    private int publicSpaces;

    @Column(name = "permit_spaces")
    private int permitSpaces;

    @Column(name = "off_street_spaces")
    private int offStreetSpaces;

    public ParkingZone(long id, String councilZoneIdentifier, int price, Hours hours, String description, int publicSpaces, int permitSpaces, int offStreetSpaces) {
        this.id = id;
        this.councilZoneIdentifier = councilZoneIdentifier;
        this.price = price;
        this.hours = hours;
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

    public String getCouncilZoneIdentifier() {
        return councilZoneIdentifier;
    }

    public int getPrice() {
        return price;
    }

    public Hours getParkingSpots() {
        return hours;
    }

    public String getDescription() {
        return description;
    }

    public int getPublicSpaces() {
        return publicSpaces;
    }

    public int getPermitSpaces() {
        return permitSpaces;
    }

    public int getOffStreetSpaces() {
        return offStreetSpaces;
    }

}
