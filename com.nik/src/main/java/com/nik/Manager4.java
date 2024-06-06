package com.nik;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager4
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		CriteriaBuilder builder = session.getCriteriaBuilder();

		// Create CriteriaQuery
		CriteriaQuery<Student> criteria = builder.createQuery(Student.class);
		Root<Student> student = criteria.from(Student.class);
		// criteria.where(builder.equal(student.get("ROLL"), 132));
		Criteria criteria1 = session.createCriteria(Student.class);

		criteria1.add(Restrictions.ge("age", 23));
		criteria1.add(Restrictions.like("fname", "aaa"));

		List<Student> students = criteria1.list();
		//List<Student> students = session.createQuery(criteria).getResultList();

		students.forEach(s1 -> System.out.println(s1));
	}
}
