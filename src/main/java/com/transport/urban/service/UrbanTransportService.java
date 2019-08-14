package com.transport.urban.service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.transport.urban.entity.CarDetails;

@Component
public class UrbanTransportService {
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMMdd");
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh a");

	
	public List<CarDetails> getVehiclesList() {
		List<CarDetails> vehicleInfo = VehicleInfo.getPrePopulateVehicles();
		return vehicleInfo;
	}
	
	public String getAvailableVehicles(String start,
												 String end,
												 String date,
												 String time) {
		List<CarDetails> vehicleInfo = VehicleInfo.getPrePopulateVehicles();
		
		Predicate<CarDetails> isStartLocation = e -> e.getStartLocation().equals(start);		
		Predicate<CarDetails> isEndLocation = e -> e.getEndLocation().equals(end);
        Predicate<CarDetails> isStartDateTime = e -> e.getStartDateTime().equals(date+" "+time);
        
        String result = vehicleInfo.stream()
                .filter(isStartLocation.and(isEndLocation).and(isStartDateTime))
                .map(e -> e.getName())
                .collect(Collectors.joining(",", "[", "]"));
        
      return result;
        
	}

}
