package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager4
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Student s2 = (Student) s1.load(Student.class, 5);
//		s2.setAge(34);
//		s2.setFname("abc");
//		s2.setLname("xyz");
		Transaction tx=s1.beginTransaction();
		s1.delete(s2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
