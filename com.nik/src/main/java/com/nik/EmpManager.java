package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nik.entity.Employee;
import com.nik.util.Util;

public class EmpManager
{
	public static void main(String[] args)
	{

		Session session = Util.getSession();

		Transaction tx = session.beginTransaction();

		Employee employee = new Employee();
		employee.setId(123);
		employee.setName("abc");
		employee.setAge(24);
		employee.setSalary(50000);

		session.save(employee);
		tx.commit();
		session.close();
		System.out.println("done");
	}
}
