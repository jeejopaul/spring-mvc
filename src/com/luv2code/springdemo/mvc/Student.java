package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

import org.springframework.beans.factory.annotation.Value;


public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	//private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
//		countryOptions = new LinkedHashMap<String, String>();
//		countryOptions.put("India", "India");
//		countryOptions.put("Malaysia", "Malaysia");
	}

	public String getFirstName() {
		return firstName;
	}
	
//	public LinkedHashMap<String, String> getCountryOptions() {
//		return countryOptions;
//	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
