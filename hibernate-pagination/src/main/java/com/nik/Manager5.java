package com.nik;

import java.util.List;

import org.hibernate.Session;

import com.nik.util.Util;

public class Manager5 {
	public static void main(String[] args) {
		Session session = Util.getSession();
		String sql = "select * from student";
		List<Object[]> obj = session.createSQLQuery(sql).list();
		for (Object row[] : obj) {
			for(Object ob:row) {
				System.out.print(ob +" ");
			}
			System.out.println();
		}

	}
}
