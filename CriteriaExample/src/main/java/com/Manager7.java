package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager7
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		@SuppressWarnings("deprecation")
		Criteria ctr = s1.createCriteria(Student.class);
		List<Student> list = ctr.list();
		for (Student s2 : list)
		{
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
			System.out.println("----------------");
		}
		//s1.flush();
		//s1.close();
		System.out.println("done");
	}
}
