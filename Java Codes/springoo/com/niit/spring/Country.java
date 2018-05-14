package com.niit.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Country {

	private String countryName;
	private Capital capital;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Capital getCapital() {
		return capital;
	}

	@Autowired
	public void setCapital(Capital capital) {
		this.capital = capital;
	}
}