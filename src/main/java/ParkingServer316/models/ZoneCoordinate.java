package ParkingServer316.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ZoneCoordinates")

public class ZoneCoordinate {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "zoneId")
    private int ZoneId;

    @Column(name = "latitude")
    private String Latitude;

    @Column(name = "longitude")
    private String Longitude;

    public ZoneCoordinate(long id, int zoneId, String latitude, String longitude) {
        this.id = id;
        ZoneId = zoneId;
        Latitude = latitude;
        Longitude = longitude;
    }

    public ZoneCoordinate() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getZoneId() {
        return ZoneId;
    }

    public void setZoneId(int zoneId) {
        ZoneId = zoneId;
    }

    public String getLatitude() {
        return Latitude;
    }

    public void setLatitude(String latitude) {
        Latitude = latitude;
    }

    public String getLongitude() {
        return Longitude;
    }

    public void setLongitude(String longitude) {
        Longitude = longitude;
    }

}
