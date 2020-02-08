package com.nik;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Manager
{
	public static void main(String[] args)
	{
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student student = new Student();
		student.setRollNo(123);
		student.setName("Abc");
		student.setAge(45);
		session.save(student);
		session.flush();
		tx.commit();
		session.close();

		System.out.println("done");
	}
}
