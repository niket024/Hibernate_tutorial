package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager2
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Student p1 = session.load(Student.class, 34);
		if (p1 != null)
		{
			System.out.println(p1.getRollNo());
			System.out.println(p1.getName());
			System.out.println(p1.getAge());
		} else
		{
			System.out.println("No record founds");
		}
		
		p1.setName("pppp");
		session.saveOrUpdate(p1);
		
		System.out.println("done");
		System.out.println(session.load(Student.class, 34).getName());
		session.delete(p1);
		tx.commit();

	}
	
}
