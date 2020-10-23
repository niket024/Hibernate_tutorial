package com.nik;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nik.entity.Employee;
import com.nik.util.Util;

public class PopulateEmployee {
	public static void main(String[] args) {
		Session session = Util.getSession();
		try {
			session.beginTransaction();

			for (int i = 0; i < 100; i++) {
				Employee employee = new Employee();
				employee.setName("employe_" + i);
				employee.setSurname("surname_" + i);
				employee.setTitle("Engineer_" + i);
				employee.setCreated(new Date());
				session.save(employee);
			}

			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
		System.out.println("100 employee populated");
	}
}
