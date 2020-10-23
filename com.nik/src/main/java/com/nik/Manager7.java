package com.nik;

import java.util.List;

import org.hibernate.Session;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager7 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		List<Student> students = s1.getNamedQuery("getAllStudents").getResultList();
		students.forEach(s -> System.out.println(s));

	}
}
