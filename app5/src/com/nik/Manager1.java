package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager1
{
public static void main(String[] args)
{
	Configuration c1=new Configuration();
	c1.configure("person.cfg.xml");
	SessionFactory sf=c1.buildSessionFactory();
	Session s1=sf.openSession();
	Transaction tx=s1.beginTransaction();
	Person p1=new Person();
	p1.setFname("abc");
	p1.setLname("xyz");
	p1.setAge(34);
	s1.save(p1);
	tx.commit();
	s1.flush();
	s1.close();
	System.out.println("done");
	
}
}
