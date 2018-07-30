package org.miles.springbootstarter.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.miles.springbootstarter.entity.Trip;
import org.miles.springbootstarter.service.MileageTripService;
import org.springframework.stereotype.Service;

@Service
public class MileageTripServiceImpl implements MileageTripService{
	
	private List<Trip> trips = new ArrayList<>(Arrays.asList(
			new Trip(1,123,"Personal"),
			new Trip(2,321,"Business")
			));

	@Override
	public List<Trip> getAllTrips() throws Exception {
		return trips;
	}

	@Override
	public Trip getTripsById(Integer id) throws Exception {
		return trips.stream().filter(t -> t.getTripId().equals(id)).findFirst().get();
	}

	@Override
	public void startTrip(Trip trip) throws Exception {
		trips.add(trip);
	}

	@Override
	public void updateTrip(Trip trip, Integer id) throws Exception {
		for(int i = 0; i < trips.size(); i++){
			Trip t = trips.get(i);
			if(t.getTripId().equals(id)){
				trips.set(i, trip);
				return;
			}
			
		}
		
	}

	@Override
	public void deleteTrip(Integer id) throws Exception {
		trips.removeIf(t -> t.getTripId().equals(id));
		
	}

}
