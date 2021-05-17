package com.parkingSystem.entity;

public class Vehicle {
	String registrationNumber;
	String color;

	public Vehicle(String registrationNumber, String color) {
		this.registrationNumber = registrationNumber;
		this.color = color;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [registrationNumber=" + registrationNumber + ", color=" + color + "]";
	}

}
