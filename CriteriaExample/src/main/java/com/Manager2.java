package com;

import org.hibernate.Session;

public class Manager2
{
	public static void main(String[] args)
	{
   Session s1=Util.getConnection();
   Student s2=(Student)s1.get(Student.class, 100);
//   System.out.println(s2.getRoll());
//   System.out.println(s2.getFname());
//   System.out.println(s2.getLname());
//   System.out.println(s2.getAge());
   Student s3=(Student)s1.load(Student.class, 1);
   System.out.println(s3.getFname());
   System.out.println(s3.getLname());
   s1.flush();
   s1.close();
   System.out.println("done");
	}
}
