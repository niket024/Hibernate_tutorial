package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Manager
{
	public static void main(String[] args)
	{
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory(sr);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		Person p1 = new Person();
		p1.setId(444);
		p1.setfName("aaa");
		p1.setlName("bbbb");
		p1.setAge(34);
		session.save(p1);
		tx.commit();
		session.flush();
		session.close();
		System.out.println("Done");

	}
}
