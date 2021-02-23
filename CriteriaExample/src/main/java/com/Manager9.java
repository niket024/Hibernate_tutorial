package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class Manager9
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Criteria ctr = s1.createCriteria(Student.class);
		ctr.add(Restrictions.ge("age", 30));
		//ctr.add(Restrictions.le("age", 30));
		//ctr.add(Restrictions.eq("age", 56));
		
		
		List<Student> list = ctr.list();
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
