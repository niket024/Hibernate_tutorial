package com.nik.composite;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person1")
public class Person {
	@Id
	private PersonPk pk;
	private String lname;
	private int age;

	public PersonPk getPk() {
		return pk;
	}

	public void setPk(PersonPk pk) {
		this.pk = pk;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
