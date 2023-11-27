package ParkingServer.controllers;

import ParkingServer.models.ParkingSpot;
import ParkingServer.repositories.ParkingSpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParkingSpotsController {

    @Autowired
    ParkingSpotsRepository parkingSpotsRepository;

    @GetMapping(value = "/parkingSpots")
    public ResponseEntity<List<ParkingSpot>> getAllParkingSpots(){
        return new ResponseEntity<>(parkingSpotsRepository.findAll(), HttpStatus.OK);
    }


}
