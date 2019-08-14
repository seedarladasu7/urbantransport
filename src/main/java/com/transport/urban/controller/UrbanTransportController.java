package com.transport.urban.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.transport.urban.entity.CarDetails;
import com.transport.urban.service.UrbanTransportService;

@RestController
@RequestMapping("/services")
public class UrbanTransportController {
	
	@Autowired
	UrbanTransportService service;
	
	@GetMapping("/getVehicles")
	public List<CarDetails> getDetails() {
		return service.getVehiclesList();
	}
	
	@GetMapping("/getAvailableVehicles")
	public String getAvailableVehicles( @RequestParam(value = "start", required=false) final String start,
										@RequestParam(value = "end", required=false) final String end, 
										@RequestParam(value = "date", required=false) final String date, 
										@RequestParam(value = "time", required=false) final String time) {
		
		return service.getAvailableVehicles(start, end, date, time);
	}

}
