package com.nik;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="p_emp1")

public class PermanantEmployee extends Employee
{
	private double salary;
	private int leaveCount;
public double getSalary()
	{
		return salary;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public int getLeaveCount()
	{
		return leaveCount;
	}

	public void setLeaveCount(int leaveCount)
	{
		this.leaveCount = leaveCount;
	}

}
