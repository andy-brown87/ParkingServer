package ParkingServer316.repositories;

import ParkingServer316.models.ParkingSpot;
import ParkingServer316.models.ParkingZone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingZonesRepository extends JpaRepository<ParkingZone, String> {
}
