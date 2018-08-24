package com.cities.service.model;

public class ConnectedCity {
	
	private String origin;
	private String destination;
	
	
	public ConnectedCity(String origin, String destination) {
		super();
		this.origin = origin;
		this.destination = destination;
	}


	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	};
	
	
}
