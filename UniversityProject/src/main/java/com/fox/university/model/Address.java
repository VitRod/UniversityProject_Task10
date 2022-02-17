package com.fox.university.model;

public class Address {
	
	private int id;
	private String country;
	private String postalСode;
	private String region;
	private String city;
	private String streetAdress;
	
	public Address() {
		
	}
	
	public Address(int id, String country, String postalСode, String region, String city, String streetAdress) {
		this.id = id;
		this.country = country;
		this.postalСode = postalСode;
		this.region = region;
		this.city = city;
		this.streetAdress = streetAdress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalСode;
	}

	public void setPostalCode(String postalСode) {
		this.postalСode = postalСode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreetAdress() {
		return streetAdress;
	}

	public void setStreetAdress(String streetAdress) {
		this.streetAdress = streetAdress;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", country=" + country + ", postalСode=" + postalСode + ", region=" + region
				+ ", city=" + city + ", streetAdress=" + streetAdress + "]";
	}
}
