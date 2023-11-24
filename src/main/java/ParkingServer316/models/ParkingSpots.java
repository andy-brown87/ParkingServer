package ParkingServer316.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ParkingSpots")

public class ParkingSpots {

    @Id

    @Column(name = "id")
    private long id;

    @Column(name = "vehicle_id")
    private long vehicleId;


}
