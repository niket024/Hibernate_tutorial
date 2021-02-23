package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager8
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		List<Student> list = s1.createCriteria(Student.class).list();
		for (Student s2 : list)
		{
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
			System.out.println("----------------");
		}
		System.out.println("done");
	}
}
