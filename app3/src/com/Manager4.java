package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager4
{
	public static void main(String[] args)
	{
		Session s1 = Util.getConnection();
		String ch=null;
		Scanner sc = new Scanner(System.in);
		do
		{
		Transaction tx = s1.beginTransaction();
		System.out.println("enter the firstname");
		String fname = sc.next();
		System.out.println("enter the lastname");
		String lname = sc.next();
		System.out.println("enter the age");
		int age = sc.nextInt();
		Student s2 = new Student();
		s2.setFname(fname);
		s2.setLname(lname);
		s2.setAge(age);
		s1.save(s2);
		tx.commit();
		System.out.println("do you want again?(y/n)");
		ch=sc.next();
		}while("y".equalsIgnoreCase(ch));
		s1.flush();
		s1.close();
		System.out.println("thanks !");
	}
}
