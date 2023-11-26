package ParkingServer316.controllers;

import ParkingServer316.models.ParkingZone;
import ParkingServer316.models.SpotCoordinate;
import ParkingServer316.repositories.SpotCoordinatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SpotCoordinatesController {


    @Autowired
    SpotCoordinatesRepository spotCoordinateRepository;

    @GetMapping(value = "/spotcoordinates")
    public ResponseEntity<List<SpotCoordinate>> getAllSpotCoordinaates(){
        return new ResponseEntity<>(spotCoordinateRepository.findAll(), HttpStatus.OK);
    }

}
