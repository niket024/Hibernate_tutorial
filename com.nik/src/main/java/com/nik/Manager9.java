package com.nik;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager9 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Query query = session.createQuery("from Student where roll =: roll");
		query.setParameter("roll", 8);
		List<Student> std = query.getResultList();
		for (Student s2 : std) {
			System.out.println(s2.getRoll());
			System.out.println(s2.getFname());
			System.out.println(s2.getLname());
			System.out.println(s2.getAge());
			System.out.println("----------");

		}
	}
}
