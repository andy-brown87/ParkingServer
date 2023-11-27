package ParkingServer.controllers;
import ParkingServer.models.Hours;
import ParkingServer.repositories.HoursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HoursController {

    @Autowired
    HoursRepository hoursRepository;

    @GetMapping(value = "/hours")
    public ResponseEntity<List<Hours>> getAllHours(){
        return new ResponseEntity<>(hoursRepository.findAll(), HttpStatus.OK);
    }


}
