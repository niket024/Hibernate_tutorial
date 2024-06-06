package com.nik;

import org.hibernate.Session;

import com.nik.entity.Employee;
import com.nik.util.Util;

public class EmpManager1
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Employee employee = session.get(Employee.class, 2);
		if (employee != null)
		{
			System.out.println("id=" + employee.getId());
			System.out.println("name=" + employee.getName());
		} else
		{
			System.out.println("No object found");
		}
		
	}
}
