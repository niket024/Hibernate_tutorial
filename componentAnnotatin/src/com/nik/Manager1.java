package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
  public static void main(String[] args)
{
	Session s1=Util.getConnection();
	Transaction tx=s1.beginTransaction();
	Address a1=new Address();
	a1.setStreetName("jayanager");
	a1.setCity("Banglore");
	a1.setState("karnataka");
	Person p1=new Person();
	p1.setFname("nidhi");
	p1.setLname("Mol");
	p1.setAddress(a1);
	s1.save(p1);
	tx.commit();
	s1.flush();
	s1.close();
	System.out.println("done");
}
}
