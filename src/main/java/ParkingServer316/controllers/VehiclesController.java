package ParkingServer316.controllers;

import ParkingServer316.models.SpotCoordinate;
import ParkingServer316.models.Vehicle;
import ParkingServer316.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController public class VehiclesController {

    @Autowired
    VehicleRepository vehicleRepository;

    @GetMapping(value = "/vehicles")
    public ResponseEntity<List<Vehicle>> getAllVehicles(){
        return new ResponseEntity<>(vehicleRepository.findAll(), HttpStatus.OK);
    }

}
