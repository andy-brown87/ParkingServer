package ParkingServer316.repositories;

import ParkingServer316.models.ParkingSpot;
import ParkingServer316.models.ParkingZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ParkingZonesRepository extends JpaRepository<ParkingZone, String> {
}
