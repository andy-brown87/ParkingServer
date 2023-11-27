package ParkingServer.controllers;

import ParkingServer.models.ParkingSpot;
import ParkingServer.models.SpotCoordinate;
import ParkingServer.repositories.SpotCoordinatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class SpotCoordinatesController {


    @Autowired
    SpotCoordinatesRepository spotCoordinateRepository;

    @GetMapping(value = "/spotcoordinates")
    public ResponseEntity<List<SpotCoordinate>> getAllSpotCoordinates() {
        return new ResponseEntity<>(spotCoordinateRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/spotcoordinates/{id}")
    public Optional<SpotCoordinate> getSpotCoordinates(@PathVariable String id) {
        return spotCoordinateRepository.findById(id);
    }




}
