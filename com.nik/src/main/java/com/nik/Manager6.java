package com.nik;

import java.util.List;

import org.hibernate.Session;

import com.nik.util.Util;

public class Manager6 {
public static void main(String[] args) {
	Session session = Util.getSession();
	String sql = "select First_name from person";
	List<String> obj = session.createSQLQuery(sql).list();
	obj.forEach(s->System.out.println(s));
}
}
