package com.nik.composite;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class PersonPk implements Serializable {
	private String fname;
	private String email;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
