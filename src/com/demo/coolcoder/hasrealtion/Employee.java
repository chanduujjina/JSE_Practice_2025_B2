package com.demo.coolcoder.hasrealtion;

public class Employee {
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private int id;
	
	private String empName;
	
	private Address address;//has relation(Asssocation)

}
