package com.capg.Di;

public class Address {

	private String cityName;
	private String stateName;
	private String countryName;
	
	
	public Address(String cityName, String stateName, String countryName) {
		super();
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	
	public Address() {
		super();
	}
	
	
	public String toString()
	{
		return cityName + " " +stateName + " " +countryName;
	}
	
}
