package com;

import java.util.List;

import org.hibernate.Session;

public class Manager11
{
public static void main(String[] args)
{
	Session s1=Util.getConnection();
	
	List<Object[]> obj=s1.getNamedQuery("q1").list();
	for(Object row[]:obj)
	{
		for(Object col:row)
		{
			System.out.println(col+",");
		}
		System.out.println("----------");
	}
}
}
