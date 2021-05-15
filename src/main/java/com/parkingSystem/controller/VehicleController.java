package com.parkingSystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.entity.Vehicle;
import com.parkingSystem.service.VehicleService;

@RestController
public class VehicleController {

	@Autowired
	VehicleService vehicleService;

	// add vehicle
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PostMapping(value = "/vehicles")
	public ResponseEntity addVehicleDetails(@RequestBody Vehicle vehicle) {
		vehicleService.addVehicleDetails(vehicle);
		return new ResponseEntity(vehicle, HttpStatus.OK);
	}

	// get all vehicle
	@GetMapping(value = "/vehicles")
	public List<Vehicle> getAllVehicle(@RequestBody Vehicle vehicle) {
		return vehicleService.getVehicleDetails();
	}

	// update vehicle
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@PutMapping("/vehicles")
	public ResponseEntity<String> updateVehicleDetails(@RequestBody Vehicle vehicle, @RequestHeader int id) {
		try {
			vehicleService.updateVehicleDetails(vehicle, id);
			return new ResponseEntity(vehicle, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity(vehicle, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@DeleteMapping("/vehicles")
	public String deleteVehicleDetail(@RequestHeader int id) {
		return vehicleService.deleteByVehicleId(id);
	}

}
