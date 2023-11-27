package ParkingServer.repositories;

import ParkingServer.models.ZoneCoordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ZoneCoordinateRepository extends JpaRepository<ZoneCoordinate, Integer> {


    List<ZoneCoordinate> findByZoneId(int id);

}
