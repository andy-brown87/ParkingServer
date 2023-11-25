package ParkingServer316.repositories;

import ParkingServer316.models.ParkingZone;
import ParkingServer316.models.ZoneCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZoneCoordinateRepository extends JpaRepository<ZoneCoordinate, Long> {
}
