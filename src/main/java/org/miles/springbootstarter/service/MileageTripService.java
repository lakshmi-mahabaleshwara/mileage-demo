package org.miles.springbootstarter.service;

import java.util.List;

import org.miles.springbootstarter.entity.Trip;

public interface MileageTripService {
	
	public List<Trip> getAllTrips() throws Exception;
	
	public Trip getTripsById(Integer id) throws Exception;
	
	public void startTrip(Trip trip) throws Exception;
	
	public void updateTrip(Trip trip, Integer id) throws Exception;
	
	public void deleteTrip(Integer id) throws Exception;

}
