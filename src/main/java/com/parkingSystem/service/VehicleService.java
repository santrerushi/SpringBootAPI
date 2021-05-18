package com.parkingSystem.service;

import java.util.List;
import com.parkingSystem.entity.Vehicle;

public interface VehicleService {

	List<Vehicle> getVehicleDetails();

	Vehicle addVehicleDetails(Vehicle vehicle);

	Vehicle updateVehicleDetails(int id,Vehicle vehicle);

	void deleteVehicleDetails(int id);
}
