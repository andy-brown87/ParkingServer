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
    private long Latitude;

    @Column(name = "longitude")
    private long Longitude;

    @Column(name = "latitudedelta")
    private long LatitudeDelta;

    @Column(name = "longitudedelta")
    private long LongitudeDelta;

    public ZoneCoordinate(long id, int zoneId, long latitude, long longitude, long latitudeDelta, long longitudeDelta) {
        this.id = id;
        ZoneId = zoneId;
        Latitude = latitude;
        Longitude = longitude;
        LatitudeDelta = latitudeDelta;
        LongitudeDelta = longitudeDelta;
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

    public long getLatitude() {
        return Latitude;
    }

    public void setLatitude(long latitude) {
        Latitude = latitude;
    }

    public long getLongitude() {
        return Longitude;
    }

    public void setLongitude(long longitude) {
        Longitude = longitude;
    }

    public long getLatitudeDelta() {
        return LatitudeDelta;
    }

    public void setLatitudeDelta(long latitudeDelta) {
        LatitudeDelta = latitudeDelta;
    }

    public long getLongitudeDelta() {
        return LongitudeDelta;
    }

    public void setLongitudeDelta(long longitudeDelta) {
        LongitudeDelta = longitudeDelta;
    }
}
