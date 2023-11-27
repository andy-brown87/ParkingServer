package ParkingServer.controllers;
import ParkingServer.models.SpotCoordinate;
import ParkingServer.models.ZoneCoordinate;
import ParkingServer.repositories.ZoneCoordinateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@RestController
public class ZoneCoordinatesController {

    @Autowired
    ZoneCoordinateRepository zonecoordinateRepository;

    @GetMapping(value = "/zonecoordinates")
    public ResponseEntity<List<ZoneCoordinate>> getAllZoneCoordinates(){
        return new ResponseEntity<>(zonecoordinateRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/zonecoordinates/{id}")
    public ResponseEntity<List<ZoneCoordinate>> getZoneCoordinatesByZoneId(@PathVariable int id) {
        return new ResponseEntity<>(zonecoordinateRepository.findByZoneId(id), HttpStatus.OK);
    }



}
