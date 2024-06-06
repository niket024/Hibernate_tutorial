package com.nik;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.nik.PersonPk;
@Entity
@Table(name="p4table")
public class Person
{
	@EmbeddedId
	private	PersonPk pk;
	@Column(name="L_name")
	private String lname;
	@Column(name="age")
	private int age;
	public PersonPk getPk()
	{
		return pk;
	}
	public void setPk(PersonPk pk)
	{
		this.pk = pk;
	}
	public String getLname()
	{
		return lname;
	}
	public void setLname(String lname)
	{
		this.lname = lname;
	}
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}