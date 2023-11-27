package ParkingServer.repositories;
import ParkingServer.models.BicycleSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BicycleSpotsRepository extends JpaRepository<BicycleSpot, Long> {



}
