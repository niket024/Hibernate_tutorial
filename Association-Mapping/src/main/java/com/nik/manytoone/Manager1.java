package com.nik.manytoone;

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

		c1.setCustomerId(504);
		c1.setCustomerName("customer4");
		c1.setParent(v);

		Customers c2 = new Customers();

		c2.setCustomerId(505);
		c2.setCustomerName("customer5");
		c2.setParent(v);

		Customers c3 = new Customers();

		c3.setCustomerId(506);
		c3.setCustomerName("customer6");
		c3.setParent(v);

		Transaction tx = session.beginTransaction();

		// session.save(v);
		session.save(c2);
		session.save(c2);
		session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many to One with annotation done...!!");

	}
}
