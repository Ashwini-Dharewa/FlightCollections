package com.capgemini.flight_app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;


public class FlightDetailsCollection {
	
	ArrayList<FlightPojo> flightList=new ArrayList<FlightPojo>();
	
		
	public void addFlightDetails(FlightPojo flightObj)
	{
		flightList.add(flightObj);
	}
	
	public ArrayList<FlightPojo> removeFlightDetails(int flightId)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flightList.remove(flight);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist!");
	}
	
	public ArrayList<FlightPojo> updateFlightOrigin(int flightId,String origin)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setOrigin(origin);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist!");
	}
	
	public ArrayList<FlightPojo> updateFlightDestination(int flightId,String destination)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setDestination(destination);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist!");
	}
	
	public ArrayList<FlightPojo> updateFlightDeptTime(int flightId,Date deptTime)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setDepartTime(deptTime);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist!");
	}
	
	public ArrayList<FlightPojo> updateFlightArrivalTime(int flightId,Date arrTime)
	{
		for(FlightPojo flight:flightList)
		{
			if(flight.getFlightId()==flightId)
			{
				flight.setArrivalTime(arrTime);
				return flightList;
			}
		}
		throw new RuntimeException("Account does not exist!");
	}
	
	public ArrayList<FlightPojo> getAllFlightDetails()
	{
		return flightList;
	}
	
	public ArrayList<FlightPojo> sortByCheapest()
	{
		 flightList.sort((FlightPojo fl1,FlightPojo fl2)->((int)fl1.getFare()-(int)fl2.getFare()));
		 return flightList;
	}
	
	public ArrayList<FlightPojo> sortByRoute()
	{
		 Collections.sort(flightList,new Comparator<FlightPojo>(){
			 @Override
			 public int compare(FlightPojo fl1,FlightPojo fl2)
			 {
				 return ((int)fl1.getTotalTime()-((int)fl2.getTotalTime()));
			 }
		 });
		 return flightList;
	}
	
	public ArrayList<FlightPojo> findMorningFlight()
	{
		ArrayList<FlightPojo> morning=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getDepartTime().getHours()>6 && flight.getDepartTime().getHours()<=12)
			{
				morning.add(flight);
				
			}
		}
		return morning;
	}
	
	public ArrayList<FlightPojo> findNoonFlight()
	{
		ArrayList<FlightPojo> noon=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getDepartTime().getHours()>12 && flight.getDepartTime().getHours()<=18)
			{
				noon.add(flight);
				
			}
		}
		return noon;
	}
	
	public ArrayList<FlightPojo> findNightFlight()
	{
		ArrayList<FlightPojo> night=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getDepartTime().getHours()>18 && flight.getDepartTime().getHours()<=23)
			{
				night.add(flight);
				
			}
		}
		return night;
	}
	
	public ArrayList<FlightPojo> findMidNightFlight()
	{
		ArrayList<FlightPojo> midnight=new ArrayList<FlightPojo>();
		for(FlightPojo flight:flightList)
		{
			if(flight.getDepartTime().getHours()<=6)
			{
				midnight.add(flight);
				
			}
		}
		return midnight;
	}

}
