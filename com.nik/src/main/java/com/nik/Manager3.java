package com.nik;

import java.util.Scanner;

import org.hibernate.Session;

import com.nik.entity.Student;
import com.nik.util.Util;

public class Manager3 {
	public static void main(String[] args) {
		Session s1 = Util.getSession();

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		//student.setRoll(8);
		System.out.println("Enter the fname");
		student.setFname(sc.next());
		System.out.println("Enter the lname");
		student.setLname(sc.next());
		System.out.println("Enter the age");
		student.setAge(sc.nextInt());

		s1.saveOrUpdate(student);
		s1.beginTransaction().commit();
		sc.close();
		//s1.close();
		System.out.println("Student registred");
	}
}
