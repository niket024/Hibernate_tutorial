package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.entity.Person;
import com.nik.util.Util;

public class Manager2 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Person p = session.load(Person.class, 5);
		session.delete(p);
		tx.commit();
		System.out.println("done");
	}
}
