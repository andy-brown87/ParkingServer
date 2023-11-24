package ParkingServer316.controllers;

import ParkingServer316.models.Bicycle_spots;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Bicycle_spotsController {

    @Autowired
    Bicycle_spotsRepository bicycle_spotsRepository;

    @GetMapping(value = "/bicycle_spots")
    public ResponseEntity<List<Bicycle_spots>> getAllBicycleSpots(){
        return new ResponseEntity<>(bicycle_spotsRepository.findAll(), HttpStatus.OK);
    }


}
