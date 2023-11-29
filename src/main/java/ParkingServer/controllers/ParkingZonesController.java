package ParkingServer.controllers;


import ParkingServer.models.ParkingZone;
import ParkingServer.models.SpotCoordinate;
import ParkingServer.repositories.ParkingZonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ParkingZonesController {

    @Autowired
    ParkingZonesRepository parkingZonesRepository;

    @GetMapping(value = "/parkingzones")
    public ResponseEntity<List<ParkingZone>> getAllParkingZones() {
        return new ResponseEntity<>(parkingZonesRepository.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/parkingzones/{id}")
    public Optional<ParkingZone> getParkingZone(@PathVariable String id) {
        return parkingZonesRepository.findById(id);
    }

}
