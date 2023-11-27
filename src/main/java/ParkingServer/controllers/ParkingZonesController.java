package ParkingServer.controllers;


import ParkingServer.models.ParkingZone;
import ParkingServer.repositories.ParkingZonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingZonesController {

    @Autowired
    ParkingZonesRepository parkingZonesRepository;

    @GetMapping(value = "/parkingzones")
    public ResponseEntity<List<ParkingZone>> getAllParkingZones() {
        return new ResponseEntity<>(parkingZonesRepository.findAll(), HttpStatus.OK);
    }
}
