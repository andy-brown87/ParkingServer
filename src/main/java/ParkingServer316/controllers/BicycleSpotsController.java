package ParkingServer316.controllers;
import ParkingServer316.models.BicycleSpot;
import ParkingServer316.repositories.BicycleSpotsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BicycleSpotsController {

    @Autowired
    BicycleSpotsRepository bicycleSpotsRepository;

    @GetMapping(value = "/bicyclespots")
    public ResponseEntity<List<BicycleSpot>> getAllBicycleSpots(){
        return new ResponseEntity<>(bicycleSpotsRepository.findAll(), HttpStatus.OK);
    }




}
