package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Util
{
	private static SessionFactory sf;
	static
	{
		Configuration c1 = new Configuration();
		c1.configure("hibernate.cfg.xml");

		sf = c1.buildSessionFactory();

	}

	public static Session getConnection()
	{
		Session s1 = sf.openSession();
		return s1;
	}
}
