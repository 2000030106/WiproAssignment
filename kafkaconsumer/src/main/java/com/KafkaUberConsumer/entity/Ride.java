package com.KafkaUberConsumer.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="uber_ride")
public class Ride {

	@Id
	private int id;
    private String driverName;
    private String passengerName;
    private String pickupLocation;
    private String dropLocation;
    private double fare;
    
    public Ride()
    {
    	
    }

	public Ride(int id, String driverName, String passengerName, String pickupLocation, String dropLocation,
			double fare) {
		super();
		this.id = id;
		this.driverName = driverName;
		this.passengerName = passengerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.fare = fare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}
    
    
}
