package com.demo.coolcoder.hasrealtion.client;

import com.demo.coolcoder.hasrealtion.Address;
import com.demo.coolcoder.hasrealtion.Employee;

public class AssocationClient {
	
	public static void main(String[] args) {
		
		
		Employee employee = new Employee();
		
		Address address  = new Address();
		address.setAddId(1);
		address.setAdddType("present");
		address.setAddress("test");
		
		employee.setId(1);
		
		employee.setEmpName("test");
		
		employee.setAddress(address);
		
		System.out.println("emp id :"+employee.getId());
		
		System.out.println("address :"+employee.getAddress());
		
	}

}
