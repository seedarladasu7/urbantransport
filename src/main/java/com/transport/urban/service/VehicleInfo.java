package com.transport.urban.service;

import java.util.ArrayList;
import java.util.List;

import com.transport.urban.entity.CarDetails;

public class VehicleInfo {
	
	public static List<CarDetails> getPrePopulateVehicles() {
		
		List<CarDetails> carsList = new ArrayList<>();
		
		CarDetails xylo1 = new CarDetails("Xylo1", "Miyapur", "Waverock", "Aug14 8AM" );
		CarDetails xylo2 = new CarDetails("Xylo2", "Miyapur", "Ameerpet", "Aug14 10AM" );
		CarDetails xylo3 = new CarDetails("Xylo3", "LBNagar", "Waverock", "Aug01 06AM" );
		
		CarDetails honda1 = new CarDetails("Honda1", "Miyapur", "Waverock", "Aug15 8AM" );
		CarDetails honda2 = new CarDetails("Honda2", "Miyapur", "Ameerpet", "Aug17 10AM" );
		CarDetails honda3 = new CarDetails("Honda3", "LBNagar", "Waverock", "Aug14 6AM" );
		
		CarDetails renault1 = new CarDetails("Renault1", "Miyapur", "Waverock", "Aug15 8AM");
		CarDetails renault2 = new CarDetails("Renault2", "Miyapur", "Ameerpet", "Aug15 10AM");
		CarDetails renault3 = new CarDetails("Renault3", "Miyapur", "Waverock", "Aug15 10AM");
		
		carsList.add(xylo1);
		carsList.add(xylo2);
		carsList.add(xylo3);
		
		carsList.add(honda1);
		carsList.add(honda2);
		carsList.add(honda3);
		
		carsList.add(renault1);
		carsList.add(renault2);
		carsList.add(renault3);
		
		return carsList;
		
	}

}
