package com.nik;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.nik.Util;

public class Insert
{
public static void main(String[] args)
{
	Session s1=Util.getConnection();
	Transaction tx=s1.beginTransaction();
	Person p1=new Person();
	p1.setAge(23);
	p1.setFname("abc");
	p1.setLname("xyz");
	
	Person p2=new Person();
	p2.setAge(34);
	p2.setFname("fghg");
	p2.setLname("ghg");
	s1.save(p1);
	s1.save(p2);
	tx.commit();
	s1.flush();
	s1.close();
	System.out.println("done");
	
}
}
