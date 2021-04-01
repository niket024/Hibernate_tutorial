package com.nik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager11 {
	public static void main(String[] args) {
		Session session = Util.getSession();

		Criteria ctr=session.createCriteria(Student.class);
		
		Criterion c1=Restrictions.gt("age", 30);
		Criterion c2=Restrictions.like("fname", "%a%");
		Criterion sum=Restrictions.and(c1,c2);
		//Criterion sum=Restrictions.and(c1,c2);
		ctr.add(sum);
		//ctr.add(Restrictions.or(Restrictions.gt("age", 30),Restrictions.like("fname", "%a%")));
		List<Student> list=ctr.list();
		for(Student s1:list)
		{
			System.out.println(s1.getRoll());
			System.out.println(s1.getFname());
			System.out.println(s1.getLname());
			System.out.println(s1.getAge());
			System.out.println("--------------");
		}
	}
}
