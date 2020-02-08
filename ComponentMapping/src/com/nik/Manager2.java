package com.nik;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Manager2
{
public static void main(String[] args)
{
	Session s1=Util.getConnection();
	Transaction tx=s1.beginTransaction();
	Scanner sc=new Scanner(System.in);

	do
	{
		System.out.println("enter the street name");
		String stname=sc.next();
		System.out.println("enter the city name");
		String city=sc.next();
		System.out.println("enter the state name");
		String state=sc.next();
		System.out.println("enter the fname name");
		String fname=sc.next();
		System.out.println("enter the lname name");
		String lname=sc.next();
		Address a1=new Address();
		a1.setStreetName(stname);
		a1.setCity(city);
		a1.setState(state);
		Person p1=new Person();
		p1.setFname(fname);
		p1.setLname(lname);
		p1.setAddress(a1);
		s1.save(p1);
		
		
		System.out.println("do you want to insert again?(y/n)");
	
	}while("y".equalsIgnoreCase(sc.next()));
	tx.commit();
	s1.flush();
	s1.close();
}
}
