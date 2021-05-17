package com.parkingSystem.Service;

import java.util.List;

import com.parkingSystem.entity.Vehicle;

public interface BaseClient {
	
	List<Vehicle> displayDetails();
	
	Vehicle displayDetails(String registrationNumber);
	
	Vehicle addDetails(Vehicle vehicle);
	
	Vehicle updateDetails(Vehicle vehicle,String registrationNumber);
	
	Vehicle deleteDetails(String registrationNumber);

}
