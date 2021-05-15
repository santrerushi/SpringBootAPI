package com.parkingSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.parkingSystem.entity.Vehicle;
import com.parkingSystem.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	VehicleRepository vehicleRepository;

	// add vehicle
	public Vehicle addVehicleDetails(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
		return vehicle;
	}

	// get all vehicle details
	public List<Vehicle> getVehicleDetails() {
		List<Vehicle> vehicleList = vehicleRepository.findAll();
		return vehicleList;

	}

	// update vehicle details
	public Vehicle updateVehicleDetails(Vehicle vehicle, int id) {
		Optional<Vehicle> uservehicle = vehicleRepository.findById(id);
		vehicle.setId(uservehicle.get().getId());
		vehicleRepository.save(vehicle);
		return vehicle;

	}

	// delete vehicle details
	public String deleteByVehicleId(int id) {
		try {
			Optional<Vehicle> vehicles = vehicleRepository.findById(id);
			Vehicle vehicle = vehicles.get();
			vehicleRepository.deleteById(id);
			return ("vehicle deleted" + vehicle.toString());

		} catch (Exception e) {
			return "Not found";
		}
	}

}
