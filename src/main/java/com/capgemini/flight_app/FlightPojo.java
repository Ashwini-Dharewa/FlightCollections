package com.capgemini.flight_app;

import java.util.Date;

public class FlightPojo {
	
	private int flightId;
	private String airline;
	private Date departTime;
	private Date arrivalTime;
	private double fare;
	private String origin;
	private String destination;
	private long totalTime;
	static int autoFlightNoGen;
	
	{
		flightId=++autoFlightNoGen;
	}
	
	public FlightPojo(String airline, Date departDate, Date arrivalDate, double fare, String origin,
			String destination) {
		super();
		this.airline = airline;
		this.departTime = departDate;
		this.arrivalTime = arrivalDate;
		this.fare = fare;
		this.origin = origin;
		this.destination = destination;
	}

	public int getFlightId() {
		return flightId;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public Date getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Date departDate) {
		this.departTime = departDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalDate) {
		this.arrivalTime = arrivalDate;
	}

	public double getFare() {
		return fare;
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
	}

	public long getTotalTime() {
		return (this.getArrivalTime().getTime()-this.getDepartTime().getTime());
	}

	public void setTotalTime(long totalTime) {
		this.totalTime = totalTime;
	}

	@Override
	public String toString() {
		return "FlightPojo [flightId=" + flightId + ", airline=" + airline + ", departDate=" + departTime
				+ ", arrivalDate=" + arrivalTime + ", fare=" + fare + ", origin=" + origin + ", destination="
				+ destination+ "]";
	}
	

}
