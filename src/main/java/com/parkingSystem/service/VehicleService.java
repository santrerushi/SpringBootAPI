package com.parkingSystem.Service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.parkingSystem.entity.Vehicle;

@Service
public class VehicleService implements BaseClient {

	List<Vehicle> list;

	public VehicleService() {
		list = new ArrayList<>();
		list.add(new Vehicle("MH12AC1213", "RED"));

	}

	@Override
	public List<Vehicle> displayDetails() {
		return list;
	}

	@Override
	public Vehicle displayDetails(String registrationNumber) {
		Vehicle vehicle = null;
		for (Vehicle vehicles : list) {
			if (vehicles.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
				vehicle = vehicles;
				break;
			}
		}
		return vehicle;
	}

	@Override
	public Vehicle addDetails(Vehicle vehicle) {
		list.add(vehicle);
		return vehicle;
	}

	@Override
	public Vehicle updateDetails(Vehicle vehicle, String registrationNumber) {
		for (Vehicle vehicles : list) {
			if (vehicles.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
				vehicles.setRegistrationNumber(vehicle.getRegistrationNumber());
				vehicles.setColor(vehicle.getColor());
				break;
			}

		}
		return vehicle;
	}

	@Override
	public Vehicle deleteDetails(String registrationNumber) {
		Vehicle vehicle = null;
		for (Vehicle vehicles : list) {
			if (vehicles.getRegistrationNumber().equalsIgnoreCase(registrationNumber)) {
				System.out.println("in update if ");
				list.clear();
				break;
			}

		}
		return vehicle;
	}
}
