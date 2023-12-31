package ParkingServer.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="spot_coordinates")
public class SpotCoordinate {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "parking_spots_id")
    private int ParkingSpotsId;

    @Column(name = "latitude")
    private String Latitude;

    @Column(name = "longitude")
    private String Longitude;

    public SpotCoordinate(long id, int parkingSpotsId, String latitude, String longitude) {
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

    public int getParkingSpotsId() {
        return ParkingSpotsId;
    }

    public String getLatitude() {
        return Latitude;
    }

    public String getLongitude() {
        return Longitude;
    }
}
