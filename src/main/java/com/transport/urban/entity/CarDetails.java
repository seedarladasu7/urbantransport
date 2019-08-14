package com.transport.urban.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarDetails {
	private String name;
	private String startLocation;
	private String EndLocation;
	private String startDateTime;
	
}
