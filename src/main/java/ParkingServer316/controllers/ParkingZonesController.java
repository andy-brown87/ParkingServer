package ParkingServer316.controllers;


import ParkingServer316.models.ParkingSpot;
import ParkingServer316.models.ParkingZone;
import ParkingServer316.repositories.ParkingZonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class ParkingZonesController {

    @Autowired
    ParkingZonesRepository parkingZonesRepository;

    @GetMapping(value = "/parkingZones")
    public ResponseEntity<List<ParkingZone>> getAllParkingZones(){
        return new ResponseEntity<>(parkingZonesRepository.findAll(), HttpStatus.OK);
    }


}
