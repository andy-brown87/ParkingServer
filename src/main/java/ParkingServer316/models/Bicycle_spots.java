package ParkingServer316.models;


import jakarta.persistence.*;

@Entity
@Table(name="bicycle_spots")


public class Bicycle_spots {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private long id;

    @Column(name = "council_identifier")
    private String council_identifier;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "latitude")
    private long latitude;

    @Column(name = "longitude")
    private long longitude;

    public Bicycle_spots(long id, String council_identifier, int capacity, long latitude, long longitude) {
        this.id = id;
        this.council_identifier = council_identifier;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Bicycle_spots() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCouncil_identifier() {
        return council_identifier;
    }

    public void setCouncil_identifier(String council_identifier) {
        this.council_identifier = council_identifier;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public long getLatitude() {
        return latitude;
    }

    public void setLatitude(long latitude) {
        this.latitude = latitude;
    }

    public long getLongitude() {
        return longitude;
    }

    public void setLongitude(long longitude) {
        this.longitude = longitude;
    }
}
