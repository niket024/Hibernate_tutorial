package com.nik;

import org.hibernate.Session;

public class Manager3
{
public static void main(String[] args)
{
	 Session s1=Util.getConnection();
	 Session s2=Util.getConnection();
	 Person p1=(Person)s1.get(Person.class, 1);
	 System.out.println(p1.getId());
	 System.out.println(p1.getFname());
	 System.out.println(p1.getLname());
	 System.out.println(p1.getAge());
	 //s1.clear();
	 System.out.println("--------------------");
	 Person p2=(Person)s2.get(Person.class, 1);
	 System.out.println(p2.getId());
	 System.out.println(p2.getFname());
	 System.out.println(p2.getLname());
	 System.out.println(p2.getAge());
	 
}
}
