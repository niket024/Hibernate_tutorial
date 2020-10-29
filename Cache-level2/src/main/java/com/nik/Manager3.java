package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.nik.entity.Person;

public class Manager3 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session1 = factory.openSession();
		Person p1 = (Person) session1.load(Person.class, 1);
		System.out.println(p1.getId());
		System.out.println(p1.getFirstName());
		System.out.println(p1.getLastName());
		System.out.println(p1.getAge());
		System.out.println("--------------------");
		
		Session session2 = factory.openSession();
		Person p2 = (Person) session2.load(Person.class, 1);
		System.out.println(p2.getId());
		System.out.println(p2.getFirstName());
		System.out.println(p2.getLastName());
		System.out.println(p2.getAge());
		

	}
}
