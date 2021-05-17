package com.parkingSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.parkingSystem.Service.BaseClient;
import com.parkingSystem.entity.Vehicle;

@RestController
public class VehicleController {

	@Autowired
	BaseClient baseClient;

	// get all vehicles Details
	@GetMapping(value = "/vehicles")
	public List<Vehicle> displayDeatils() {
		return baseClient.displayDetails();
	}

	// get detail of particular vehicle
	@GetMapping(value = "/vehicles/{registrationNumber}")
	public Vehicle vehicle(@PathVariable String registrationNumber) {
		return baseClient.displayDetails(registrationNumber);
	}

	// add vehicle details
	@PostMapping(value = "/addVehicle")
	public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
		return baseClient.addDetails(vehicle);
	}

	// update vehicle details
	@PutMapping("/vehciles/{registrationNumber}")
	public Vehicle updateVehicle(@RequestBody Vehicle vehicle, @PathVariable String registrationNumber) {
		return this.baseClient.updateDetails(vehicle, registrationNumber);
	}

	// delete vehicle details
	@DeleteMapping(value = "/vehicles/{registrationNumber}")
	public Vehicle deleteVehicle(@PathVariable String registrationNumber) {
		return this.baseClient.deleteDetails(registrationNumber);
	}
}
