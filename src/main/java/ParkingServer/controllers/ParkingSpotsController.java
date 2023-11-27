package ParkingServer.controllers;

import ParkingServer.models.ParkingSpot;
import ParkingServer.repositories.ParkingSpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class ParkingSpotsController {

    @Autowired
    ParkingSpotsRepository parkingSpotsRepository;

    @GetMapping(value = "/parkingspots")
    public ResponseEntity<List<ParkingSpot>> getAllParkingSpots(){
        return new ResponseEntity<>(parkingSpotsRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/parkingspots/{id}")
    public Optional<ParkingSpot> getParkingSpots(@PathVariable String id){
        return parkingSpotsRepository.findById(id);
    }




}
