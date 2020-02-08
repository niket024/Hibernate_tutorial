package com;

import java.util.List;

import org.hibernate.Session;

public class Manager12
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();

		List<Student> std = s1.createQuery("from com.Student").list();

		for (Student s2 : std)
		{
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
			System.out.println("----------");

		}

	}
}
