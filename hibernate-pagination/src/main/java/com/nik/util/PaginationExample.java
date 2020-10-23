package com.nik.util;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.nik.entity.Employee;

public class PaginationExample {
	public static void main(String[] args) {
		Session session = Util.getSession();
		int pageNumber = 2;
		int pageSize = 10;

		try {
			session.beginTransaction();
			
			Query query = session.createQuery("from Employee");
			query.setFirstResult((pageNumber - 1) * pageSize);
			query.setMaxResults(pageSize);
			
			List<Employee> employees =  query.getResultList();
			if (employees!=null) {
				System.out.println("Total Results:" + employees.size());
				for (Employee employee : employees) {
					System.out.println(employee.getId() + " - " + employee.getName());
				}
			}
			
			session.getTransaction().commit();
		}
		catch (HibernateException e) {
			e.printStackTrace();
			session.getTransaction().rollback();
		}
	}
}
