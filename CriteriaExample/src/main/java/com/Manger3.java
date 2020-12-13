package com;

import org.hibernate.Session;

public class Manger3
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Student s2 = (Student) s1.get(Student.class, 100);
		// Student s2=(Student)s1.load(Student.class, 100);
		if (s2 != null)
		{
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
		} else
		{
			System.out.println("pls check the row id crrectly");
		}
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
