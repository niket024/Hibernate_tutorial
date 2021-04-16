package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.entity.Student;
import com.nik.util.Util;

public class InsertStudent
{
	public static void main(String[] args)
	{
		Session session = Util.getSession();
		Transaction tx = session.beginTransaction();
		Student s1 = new Student(1, "bbb", "ccc", 30);
		session.save(s1);
		tx.commit();
		System.out.println("done");
	}
}
