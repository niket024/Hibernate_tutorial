package com;

import java.util.List;

import org.hibernate.Session;

public class Manager10
{
public static void main(String[] args)
{
	Session s1=Util.getConnection();
	String sql="select *  from student";
	List<Object[]> obj=s1.createSQLQuery(sql).list();
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
