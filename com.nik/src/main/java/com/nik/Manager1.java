package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.Person;
import com.nik.util.Util;

public class Manager1 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Person p = session.load(Person.class, 1);
		p.setFirstName("Ram");
		p.setLastName("kumar");
		p.setAge(45);
		session.update(p);
		tx.commit();
		System.out.println("done");
	}
}
