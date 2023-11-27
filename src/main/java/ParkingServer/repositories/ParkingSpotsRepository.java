package ParkingServer.repositories;

import ParkingServer.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotsRepository extends JpaRepository<ParkingSpot, String> {
}


