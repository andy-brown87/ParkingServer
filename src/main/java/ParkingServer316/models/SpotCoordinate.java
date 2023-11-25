package ParkingServer316.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="SpotCoordinates")
public class SpotCoordinate {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "parking_spots_id")
    private String ParkingSpotsId;

    @Column(name = "latitude")
    private String Latitude;

    @Column(name = "longitude")
    private String Longitude;

    public SpotCoordinate(long id, String parkingSpotsId, String latitude, String longitude) {
        this.id = id;
        ParkingSpotsId = parkingSpotsId;
        Latitude = latitude;
        Longitude = longitude;
    }

    public SpotCoordinate() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getParkingSpotsId() {
        return ParkingSpotsId;
    }

    public void setParkingSpotsId(String parkingSpotsId) {
        ParkingSpotsId = parkingSpotsId;
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
