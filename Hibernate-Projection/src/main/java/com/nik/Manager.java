package com.nik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.nik.entity.Person;
import com.nik.util.Util;

public class Manager
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Criteria criteria = session.createCriteria(Person.class);
		Projection projection = Projections.property("age"); 
		criteria.setProjection(projection); 
		List<Person> list = criteria.list();
		System.out.println(list);

	}
}
