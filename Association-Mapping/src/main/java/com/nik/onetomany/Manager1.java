package com.nik.onetomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.util.Util;

public class Manager1 {
	public static void main(String[] args) {

		Session session = Util.getSession();

		Vendor v = new Vendor();
		v.setVendorId(100);
		v.setVendorName("niket");

		Customers c1 = new Customers();
		c1.setCustomerId(500);
		c1.setCustomerName("customer1");

		Customers c2 = new Customers();
		c2.setCustomerId(501);
		c2.setCustomerName("customer2");

		Set<Customers> s = new HashSet<Customers>();
		s.add(c1);
		s.add(c2);

		v.setcustomers(s);

		Transaction tx = session.beginTransaction();
		session.save(v);
		tx.commit();

		session.close();
		System.out.println("One to Many Annotatios Done...!!!!!!");
	}
}
