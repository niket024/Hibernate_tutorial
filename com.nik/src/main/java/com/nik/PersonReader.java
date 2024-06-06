package com.nik;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.nik.entity.Person;
import com.nik.entity.Student;
import com.nik.util.Util;

public class PersonReader
{
public static void main(String[] args)
{
	Session session = Util.getSession();
	CriteriaBuilder builder = session.getCriteriaBuilder();

	// Create CriteriaQuery
	/*
	 * CriteriaQuery<Person> criteria = builder.createQuery(Person.class);
	 * Root<Person> student = criteria.from(Person.class);
	 * criteria.where(builder.equal(student.get("id"), 1));
	 */
	Criteria criteria = session.createCriteria(Person.class);
	
	 criteria.add(Restrictions.ge("age", 10));
	 criteria.add(Restrictions.like("firstName", "bbb"));
	 List<Person> persons = criteria.list();

	//List<Person> persons = session.createQuery(criteria).getResultList();

	persons.forEach(s1 -> System.out.println(s1));
}
}
