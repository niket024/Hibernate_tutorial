package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.entity.Person;
import com.nik.util.Util;

public class App {
	public static void main(String[] args) {

		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		String s = "abc";
		try {
			Person p1 = new Person();
			p1.setId(123);
			p1.setFirstName("ccc");
			p1.setLastName("ddd");
			p1.setAge(11);
			session.save(p1);
			tx.commit();
			
			Person p2 = new Person();
			p2.setId(123);
			p2.setFirstName("ccc");
			p2.setLastName("ddd");
			p2.setAge(11);
			session.save(p2);
			session.beginTransaction().commit();
			
			session.close();
		} catch (Exception ex) {
			ex.printStackTrace();
			tx.rollback();
		}

		System.out.println("done");
	}

}
