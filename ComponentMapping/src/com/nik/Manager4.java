package com.nik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;

public class Manager4
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		Criteria ctr = s1.createCriteria(Person.class);
		List<Person> list = ctr.list();
		for (Person p1 : list)
		{

			System.out.println(p1.getId());
			System.out.println(p1.getFname());
			System.out.println(p1.getLname());
			System.out.println(p1.getAddress().getStreetName());
			System.out.println(p1.getAddress().getCity());
			System.out.println(p1.getAddress().getState());
			System.out.println("------------------");
		}
	}
}
