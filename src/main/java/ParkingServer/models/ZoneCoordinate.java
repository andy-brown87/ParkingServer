package ParkingServer.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="zone_coordinates")

public class ZoneCoordinate {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "zone_id")
    private int zoneId;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude")
    private String longitude;

    public ZoneCoordinate(long id, int zoneId, String latitude, String longitude) {
        this.id = id;
        this.zoneId = zoneId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public ZoneCoordinate() {
    }

    public long getId() {
        return id;
    }

    public int getZoneId() {
        return zoneId;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }
}
