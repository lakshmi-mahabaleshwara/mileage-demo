package org.miles.springbootstarter.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.miles.springbootstarter.entity.Trip;
import org.miles.springbootstarter.service.MileageTripService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController()
@RequestMapping(value = "mileage")
public class MileageTripController {
	
	private static Logger logger = LoggerFactory.getLogger(MileageTripController.class);
	
	@Autowired
	private MileageTripService mileageTripService;

	@RequestMapping(method = RequestMethod.GET, value = "/trips")
	public List<Trip> getAllTrips() throws Exception{
		logger.info("Inside Get all Trips call");
		return mileageTripService.getAllTrips();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/trips/{id}")
	public Trip getTripsById(@PathVariable String id) throws Exception{
		logger.info("Inside Get Trip by Id call for Id {}",id);
		return mileageTripService.getTripsById(Integer.parseInt(id));
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/trips")
	public String startTrip(@RequestBody Trip trip) throws Exception{
		logger.info("Inside the start trip call");
		mileageTripService.startTrip(trip);
		return "Trip started successfully";
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/trips/{id}")
	public String updateTrip(@RequestBody Trip trip, @PathVariable String id) throws Exception{
		logger.info("Inside the update trip call for id {}",id);
		mileageTripService.updateTrip(trip, Integer.parseInt(id));
		return "Trip updated successfully";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/trips/{id}")
	public String deleteTrip(@PathVariable String id) throws Exception{
		logger.info("Inside the delete trip call");
		mileageTripService.deleteTrip(Integer.parseInt(id));
		return "Trip deleted successfully";
	}


}
