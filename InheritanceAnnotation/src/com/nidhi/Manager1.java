package com.nidhi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
		Human h1 = new Human();
		h1.setFname("komal");
		h1.setAge(21);
		Person p1 = new Person();
		p1.setFname("nidhi");
		p1.setAge(23);
		p1.setAddress("Madiwala");
		p1.setCity("banglore");
		Employee e1 = new Employee();
		e1.setFname("kumari");
		e1.setAge(33);
		e1.setAddress("btm");
		e1.setCity("banglore1");
		e1.setDesignation("s/w enginner");
		e1.setEmail("kumari@yahoo.com");
		PermanantEmployee pe = new PermanantEmployee();
		pe.setFname("nividita");
		pe.setAge(45);
		pe.setAddress("ranchi");
		pe.setCity("kkkk");
		pe.setDesignation("house wife");
		pe.setEmail("kumari@gamil.com");
		pe.setSalary(450000);
		pe.setLeaveCount(0);
		s1.save(h1);
		s1.save(p1);
		s1.save(e1);
		s1.save(pe);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("finish");
	}
}
