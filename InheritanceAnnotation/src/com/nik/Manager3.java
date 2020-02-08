package com.nik;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class Manager3
{
public static void main(String[] args)
{
	Session s1=Util.getConnection();
	Criteria ctr=s1.createCriteria(PermanantEmployee.class);
	List<PermanantEmployee> p1=ctr.list();
	for(Person pe:p1)
	{
		System.out.println(pe.getId());
		 System.out.println(pe.getFname());
		 System.out.println(pe.getAge());
		 System.out.println(pe.getAddress());
		 System.out.println(pe.getCity());
//		 System.out.println(pe.getDesignation());
//		 System.out.println(pe.getEmail());
//		 System.out.println(pe.getSalary());
//		 System.out.println(pe.getLeaveCount());
		 System.out.println("----");
	}
}
}
