package ParkingServer.repositories;

import ParkingServer.models.ParkingZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingZonesRepository extends JpaRepository<ParkingZone, String> {
}
