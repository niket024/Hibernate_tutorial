package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.entity.Person;
import com.nik.util.Util;

public class InsertPerson
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Person p1 = new Person(1, "ss", "vvv", 34);
		session.save(p1);
		tx.commit();
		System.out.println("done");
	}
}
