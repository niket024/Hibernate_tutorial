package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager3
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Transaction tx = s1.beginTransaction();
	
		Student s2 = new Student();
		s2.setRoll(34);
		s2.setFname("aaa");
		s2.setLname("bbb");
		s2.setAge(56);
		s1.save(s2);
		tx.commit();
		Student s3 = new Student();
		s3.setRoll(78);
		s3.setFname("ppp");
		s3.setLname("bbbb");
		s3.setAge(90);
		
		
		Transaction tx1 = s1.beginTransaction();
		s1.save(s3);
		tx1.commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
}
