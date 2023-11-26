package ParkingServer316.repositories;

import ParkingServer316.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotsRepository extends JpaRepository<ParkingSpot, String> {
}


