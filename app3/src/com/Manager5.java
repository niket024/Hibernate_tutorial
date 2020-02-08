package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager5
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
		System.out.println("----------");
		//s1.clear();
//		s1.save(s2);
//		System.out.println("-----");
//		s1.clear();
		//tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");

	}
}
