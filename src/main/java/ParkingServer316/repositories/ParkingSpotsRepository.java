package ParkingServer316.repositories;

import ParkingServer316.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpotsRepository extends JpaRepository<ParkingSpot, String> {
}


