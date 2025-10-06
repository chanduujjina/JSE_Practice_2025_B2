package com.demo.coolcoder.polymorphism;

public class Overload2 {

	public String buildName(String firstName,String lastName) {
		return firstName+" "+lastName;
	}
	
	public String buildName(String firstName,String middleName ,String lastName) {
		return firstName+" "+middleName+" "+lastName;
	}
	
	
	
	public static void main(String[] args) {
		Overload2 overload2 = new Overload2();
		
		String name1 = overload2.buildName("chandra", "ujjina");
		
		System.out.println(name1);
		
      String name2 = overload2.buildName("chandra", "sekhar","ujjina");
		
		System.out.println(name2);
		
		
	}
	
	

}
