package com.nik;

public class Person
{
private  int id;
private String fname;
private String lname;
private Address address;
public int getId()
{
	return id;
}
public void setId(int id)
{
	this.id = id;
}
public String getFname()
{
	return fname;
}
public void setFname(String fname)
{
	this.fname = fname;
}
public String getLname()
{
	return lname;
}
public void setLname(String lname)
{
	this.lname = lname;
}
public Address getAddress()
{
	return address;
}
public void setAddress(Address address)
{
	this.address = address;
}

}
