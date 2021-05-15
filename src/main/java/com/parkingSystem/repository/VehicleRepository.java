package com.parkingSystem.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parkingSystem.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

	public List<Vehicle> findAll();

	public Optional<Vehicle> deleteByregistrationNumber(String registrationNumber);

	public Vehicle findByregistrationNumber(String registrationNumber);

}