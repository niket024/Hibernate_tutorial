package com.nik;

import org.hibernate.Session;

public class Manager2
{
	public static void main(String[] args)
{
	 Session s1=Util.getConnection();
	 Human h1=(Human)s1.get(Human.class, 1);
	 System.out.println(h1.getId());
	 System.out.println(h1.getFname());
	 System.out.println(h1.getAge());
	 System.out.println("----------");
	 Person p1=(Person)s1.get(Person.class, 2);
	 System.out.println(p1.getId());
	 System.out.println(p1.getFname());
	 System.out.println(p1.getAge());
	 System.out.println(p1.getAddress());
	 System.out.println(p1.getCity());
	 System.out.println("------------");
	 Employee e1=(Employee)s1.get(Employee.class, 3);
	 System.out.println(e1.getId());
	 System.out.println(e1.getFname());
	 System.out.println(e1.getAge());
	 System.out.println(e1.getAddress());
	 System.out.println(e1.getCity());
	 System.out.println(e1.getDesignation());
	 System.out.println(e1.getEmail());
	 System.out.println("----");
	 PermanantEmployee pe=(PermanantEmployee)s1.get(PermanantEmployee.class, 4);
	 System.out.println(pe.getId());
	 System.out.println(pe.getFname());
	 System.out.println(pe.getAge());
	 System.out.println(pe.getAddress());
	 System.out.println(pe.getCity());
	 System.out.println(pe.getDesignation());
	 System.out.println(pe.getEmail());
	 System.out.println(pe.getSalary());
	 System.out.println(pe.getLeaveCount());
	 System.out.println("----");
}
}
