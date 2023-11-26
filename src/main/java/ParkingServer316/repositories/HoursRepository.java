package ParkingServer316.repositories;
import ParkingServer316.models.Hours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoursRepository extends JpaRepository<Hours, String> {
}
