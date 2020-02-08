package com.nik;

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
