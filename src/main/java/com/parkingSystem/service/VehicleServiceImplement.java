package com.parkingSystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.parkingSystem.entity.Vehicle;
import com.parkingSystem.repository.VehicleRepository;

@Service
public class VehicleServiceImplement implements VehicleService {
	
	@Autowired VehicleRepository vehicleRepository;

	@Override
	public List<Vehicle> getVehicleDetails() {
		return (List<Vehicle>) vehicleRepository.findAll();
	}

	@Override
	public Vehicle addVehicleDetails(Vehicle vehicle) {
		vehicleRepository.save(vehicle);
		return vehicle;
	}

	@Override
	public Vehicle updateVehicleDetails(int id,Vehicle vehicleDetails) {
		Optional<Vehicle> optionalVehicle=vehicleRepository.findById(id);
		Vehicle vehicle=optionalVehicle.get();
		vehicle.setRegistrationNumber(vehicleDetails.getRegistrationNumber());
		vehicle.setColor(vehicleDetails.getColor());
		vehicleRepository.save(vehicle);
		return vehicle;
	}


	public void deleteVehicleDetails(int id) {
		Vehicle entity=vehicleRepository.getOne(id);
		vehicleRepository.delete(entity);
		
	}		

}
