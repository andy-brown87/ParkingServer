package ParkingServer.repositories;

import ParkingServer.models.SpotCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpotCoordinatesRepository extends JpaRepository<SpotCoordinate, String> {
}
