package com.capgemini.flight_app;

import java.util.Date;



public class FlightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlightDetailsCollection flightObj=new FlightDetailsCollection();
		flightObj.addFlightDetails(new FlightPojo("Indigo",new Date(2010,7,19,12,45,56),new Date(2010,7,19,15,58,03),7800,"Kolkata","Bangalore"));
		flightObj.addFlightDetails(new FlightPojo("Spicejet",new Date(2015,8,16,2,15,36),new Date(2015,8,16,4,45,56),5800,"Mumbai","Bangalore"));
		flightObj.addFlightDetails(new FlightPojo("AirAsia",new Date(2016,12,10,22,12,13),new Date(2016,12,10,1,18,14),6500,"Goa","Hyderabad"));
		flightObj.addFlightDetails(new FlightPojo("Vistara",new Date(2018,27,9,9,12,13),new Date(2018,27,9,12,18,14),3500,"Mumbai","Hyderabad"));
		
		
		System.out.println("After Creation:");
		for(FlightPojo listing:flightObj.getAllFlightDetails())
			System.out.println(listing);
		System.out.println("Updating destination:");
		for(FlightPojo listing:flightObj.updateFlightDestination(1, "Chennai"))
			System.out.println(listing);
		
		System.out.println("Sort by cheapest:");
		for(FlightPojo listing:flightObj.sortByCheapest())
			System.out.println(listing);
		
		System.out.println("Sort by shortest route:");
		for(FlightPojo listing:flightObj.sortByRoute())
			System.out.println(listing);
		
		
		System.out.println("Morning Flights:");
		for(FlightPojo listing:flightObj.findMorningFlight())
			System.out.println(listing);
		
		System.out.println("Noon Flights:");
		for(FlightPojo listing:flightObj.findNoonFlight())
			System.out.println(listing);
		
		System.out.println("Night Flights:");
		for(FlightPojo listing:flightObj.findNightFlight())
			System.out.println(listing);
		
		System.out.println("MidNight Flights:");
		for(FlightPojo listing:flightObj.findMidNightFlight())
			System.out.println(listing);
		
		System.out.println("After deletion:");
		for(FlightPojo listing:flightObj.removeFlightDetails(1))
			System.out.println(listing);
		
		
		
	}

}
