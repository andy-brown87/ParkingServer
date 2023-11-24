package ParkingServer316.repositories;
import ParkingServer316.models.BicycleSpots;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleSpotsRepository extends JpaRepository<BicycleSpots, Long> {



}