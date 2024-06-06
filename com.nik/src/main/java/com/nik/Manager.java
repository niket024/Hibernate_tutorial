package com.nik;

import org.hibernate.Session;

import com.nik.entity.Person;
import com.nik.util.Util;

public class Manager
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Person p = session.get(Person.class, 100);
		if (p != null)
		{
			System.out.println(p.getId());
			System.out.println(p.getFirstName());
			System.out.println(p.getLastName());
			System.out.println(p.getAge());
			System.out.println("done");
		} else
		{
			System.out.println("No record found");
		}

	}
}
