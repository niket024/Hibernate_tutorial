package com.nik;

import org.hibernate.Session;

public class Manager2
{
public static void main(String[] args)
{
	 Session s1=Util.getConnection();
	 Person p1=(Person)s1.get(Person.class, 1);
	 System.out.println(p1.getId());
	 System.out.println(p1.getFname());
	 System.out.println(p1.getLname());
	 System.out.println(p1.getAge());
	s1.clear();
	 System.out.println("--------------");
	 Person p2=(Person)s1.get(Person.class, 1);
	 System.out.println(p2.getId());
	 System.out.println(p2.getFname());
	 System.out.println(p2.getLname());
	 System.out.println(p2.getAge());
	 System.out.println("here data is store in session object so no new session created");
	 System.out.println("if we clear the session then again new seseion is going to be created");
}
}
