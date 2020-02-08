package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager1
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
		Student s3 = new Student();
		s3.setRoll(78);
		s3.setFname("ppp");
		s3.setLname("bbbb");
		s3.setAge(90);
		s1.save(s3);
		s1.save(s2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
}
