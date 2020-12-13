package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager
{
	public static void main(String[] args)
	{

		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		try
		{
			Person p1 = new Person();
			p1.setId(123);
			p1.setfName("abc");
			p1.setlName("xyz");
			p1.setAge(24);
			session.save(p1);
			int i = 10 / 0;
			Person p2 = new Person();
			p2.setId(123);
			p2.setfName("abc");
			p2.setlName("xyz");
			p2.setAge(24);
			session.save(p2);
			tx.commit();
			System.out.println("done");
		} catch (Exception e)
		{
			e.printStackTrace();
			System.out.println("Rolling back");
			tx.rollback();
		}
	}
}
