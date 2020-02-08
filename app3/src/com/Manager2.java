package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager2
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
		Student s2 = new Student();
		s2.setRoll(44);
		s2.setFname("hhh");
		s2.setLname("ghg");
		s2.setAge(45);
		s1.save(s2);
		//s1.evict(s2);
		s1.save(s2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
}
