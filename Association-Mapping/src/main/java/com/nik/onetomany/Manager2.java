package com.nik.onetomany;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.nik.util.Util;

public class Manager2 {
	public static void main(String[] args) {

		Session session = Util.getSession();
		Query qry = session.createQuery("from Vendor c");

		@SuppressWarnings("unchecked")
		List<Vendor> vendors = qry.getResultList();
		vendors.forEach(vendor -> {
			System.out.println(vendor.getVendorId());
			System.out.println(vendor.getVendorName());
			vendor.getcustomers().forEach(customers -> {
				System.out.println(customers.getCustomerId());
				System.out.println(customers.getCustomerName());
			});
		});
		
		session.close();
		System.out.println("many to one select done..!!");
	}
}
