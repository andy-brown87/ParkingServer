package ParkingServer316.repositories;

import ParkingServer316.models.Hours;
import ParkingServer316.models.ParkingSpots;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParkingSpotsRepository extends JpaRepository<ParkingSpots, String> {
}


