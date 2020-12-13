package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager1
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Student s1 = new Student();
		s1.setRollNo(123);
		s1.setName("abc");
		s1.setAge(12);
		session.save(s1);
		tx.commit();
		session.close();
		System.out.println("done");
	}
}
