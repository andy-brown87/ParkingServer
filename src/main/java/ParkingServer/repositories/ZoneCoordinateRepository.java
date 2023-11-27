package ParkingServer.repositories;

import ParkingServer.models.ZoneCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZoneCoordinateRepository extends JpaRepository<ZoneCoordinate, String> {
}
