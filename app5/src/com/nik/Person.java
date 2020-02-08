package com.nik;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="p_table")
public class Person
{
	@Id
	@Column(name = "p_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="f_name")
	private String fname;
	@Column(name="l_name")
	private String lname;
	@Column(name="Age")
	private int age;
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
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
}
