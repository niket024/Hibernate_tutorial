package com.nik.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
@NamedQueries({ @NamedQuery(name = "getAllStudents", query = "from Student") })
public class Student implements Serializable
{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	private String fname;
	private String lname;
	private int age;
	public Student()
	{
		// TODO Auto-generated constructor stub
	}

	public Student(int roll, String fname, String lname, int age)
	{
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}

	public int getRoll()
	{
		return roll;
	}

	public void setRoll(int roll)
	{
		this.roll = roll;
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

	@Override
	public String toString()
	{
		return "Student [roll=" + roll + ", fname=" + fname + ", lname=" + lname
				+ ", age=" + age + "]";
	}

}
