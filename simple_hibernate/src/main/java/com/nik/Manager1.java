package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
		PersonPk pk = new PersonPk();
		pk.setFname("xyz");
		pk.setEmail("xyz@gmail.com");
		Person p1 = new Person();
		p1.setLname("kumari");
		p1.setAge(55);
		p1.setPk(pk);
		s1.save(p1);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
