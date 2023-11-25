package ParkingServer316.repositories;

import ParkingServer316.models.ParkingZone;
import ParkingServer316.models.SpotCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpotCoordinatesRepository extends JpaRepository<SpotCoordinate, Long> {
}
