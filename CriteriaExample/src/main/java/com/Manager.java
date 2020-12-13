package com;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager
{
	public static void main(String[] args)
	{
		Session session = Util.getConnection();
		Transaction tx = session.beginTransaction();
		Scanner sc = new Scanner(System.in);
		String ch = "";
		do
		{
			Student s1 = new Student();
			System.out.println("Enter fname");
			s1.setFname(sc.next());
			System.out.println("Enter the lname");
			s1.setLname(sc.next());
			System.out.println("Enter the age");
			s1.setAge(sc.nextInt());
			session.save(s1);
			System.out.println("Do u want to insert more y/n?");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("y"));
		tx.commit();
		sc.close();
	}
}
