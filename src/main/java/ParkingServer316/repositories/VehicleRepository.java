package ParkingServer316.repositories;

import ParkingServer316.models.ParkingZone;
import ParkingServer316.models.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
