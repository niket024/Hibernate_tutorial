package com.nik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager4 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		Criteria criteria = session.createCriteria(Student.class);
		criteria.add(Restrictions.ge("age", 40));
		criteria.add(Restrictions.like("fname", "aaa"));

		List<Student> students = criteria.list();
		
		students.forEach(s1->System.out.println(s1));
	}
}
