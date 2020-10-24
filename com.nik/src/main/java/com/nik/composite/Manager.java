package com.nik.composite;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager {
	public static void main(String[] args) {
		Session s1 = Util.getSession();
		Transaction tx = s1.beginTransaction();
		PersonPk pk = new PersonPk();
		pk.setFname("xyz");
		pk.setEmail("xyzc@gmail.com");
		Person p1 = new Person();
		p1.setLname("kumari");
		p1.setAge(55);
		p1.setPk(pk);
		s1.save(p1);
		tx.commit();
		s1.close();
		System.out.println("done");
	}
}
