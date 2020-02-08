package com.nik;

import javax.persistence.Column;

public class Address
{
	@Column(name = "s_name")
	private String streetName;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;

	public String getStreetName()
	{
		return streetName;
	}

	public void setStreetName(String streetName)
	{
		this.streetName = streetName;
	}

	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public String getState()
	{
		return state;
	}

	public void setState(String state)
	{
		this.state = state;
	}

}
