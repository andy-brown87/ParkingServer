package ParkingServer316.controllers;

import ParkingServer316.models.Vehicle;
import ParkingServer316.models.ZoneCoordinate;
import ParkingServer316.repositories.ZoneCoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController public class ZoneCoordinatesController {

    @Autowired
    ZoneCoordinateRepository zonecoordinateRepository;

    @GetMapping(value = "/zonecoordinates")
    public ResponseEntity<List<ZoneCoordinate>> getAllZoneCoordinates(){
        return new ResponseEntity<>(zonecoordinateRepository.findAll(), HttpStatus.OK);
    }

}
