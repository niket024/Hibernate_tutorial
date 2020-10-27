package com.nik.onetoone;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager1 {
	public static void main(String args[]) {
		Session session = Util.getSession();
		Student s = new Student();
		s.setStudentId(101);
		s.setStudentName("James");
		s.setGrp("mpc");

		Address ad = new Address();
		ad.setAddressId(1);
		ad.setPlace("Carolina");
		ad.setParent(s);
		
		Transaction tx = session.beginTransaction();
		session.save(ad);
		tx.commit();
		session.close();
		System.out.println("One to One with annotations is done..!!!!");
	}
}
