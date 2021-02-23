package com.nik;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.entity.Person;
import com.nik.util.Util;

public class Manager
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		List<Person> list = Arrays.asList(new Person("aaa", "bbb", 12),
				new Person("ddd", "ccc", 11), new Person("eee", "fff", 22),
				new Person("ggg", "bbb", 33), new Person("hhh", "kkk", 44));
		Transaction tx = session.beginTransaction();
		for (Person p1 : list)
		{
			session.save(p1);
		}
		tx.commit();
		System.out.println("done");

	}
}
