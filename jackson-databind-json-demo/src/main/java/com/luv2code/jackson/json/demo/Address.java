package com.luv2code.jackson.json.demo;

public class Address {

	private String street;

	private String city;

	private String state;

	private String zip;

	private String country;
	
	public Address() {}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreet() {
		return this.street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return this.city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return this.state;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZip() {
		return this.zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountry() {
		return this.country;
	}

}
