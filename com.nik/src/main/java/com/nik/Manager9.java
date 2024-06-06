package com.nik;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.nik.entity.Person;
import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager9 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Query query = session.createQuery("from Person where id =: id");
		query.setParameter("id", 1);
		List<Person> std = query.getResultList();
		for (Person s2 : std) {
			System.out.println(s2.getId());
			System.out.println(s2.getFirstName());
			System.out.println(s2.getLastName());
			System.out.println(s2.getAge());
			System.out.println("----------");

		}
	}
}
