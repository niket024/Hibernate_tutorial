package com.nik.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customers1")
public class Customers {

	@Id
	@Column(name = "custid")
	private int customerId;

	@Column(name = "custName", length = 10)
	private String customerName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "venid", referencedColumnName = "vid")
	private Vendor parent;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Vendor getParent() {
		return parent;
	}

	public void setParent(Vendor parent) {
		this.parent = parent;
	}

}
