package com;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager6
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		//Student s2 = (Student) s1.get(Student.class, 5);
		Student s2=new Student();
		s2.setRoll(44);
		s2.setAge(78);
		s2.setFname("huhih");
		s2.setLname("jhgjhgkjg");
		Transaction tx = s1.beginTransaction();
		s1.saveOrUpdate(s2);
		tx.commit();
		s1.flush();
		s1.close();
		System.out.println("done");
	}
}
