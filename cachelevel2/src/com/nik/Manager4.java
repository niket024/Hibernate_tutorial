package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Manager4
{
	public static void main(String[] args)
	{
		Configuration c1 = new Configuration();
		c1.configure("person.cfg.xml");
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				c1.getProperties()).buildServiceRegistry();
		SessionFactory sf = c1.buildSessionFactory(sr);
		Session s1 = Util.getConnection();
		Session s2 = Util.getConnection();
		Person p1 = (Person) s1.get(Person.class, 1);
		System.out.println(p1.getId());
		System.out.println(p1.getFname());
		System.out.println(p1.getLname());
		System.out.println(p1.getAge());
		System.out.println("-------------");

		System.out.println("--------------------");
		Person p2 = (Person) s2.get(Person.class, 1);
//		Person p2 = (Person) s2.get(Person.class, 2);
		System.out.println(p2.getId());
		System.out.println(p2.getFname());
		System.out.println(p2.getLname());
		System.out.println(p2.getAge());
		System.out.println("here new seeion is not created due to second level cache");
		System.out.println("her sesion obj is crossing each other");

	}
}
