package com.nik;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_table")
public class Student
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNo;
	@Column(name = "first_name")
	private String name;
	private int age;

	public int getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
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
