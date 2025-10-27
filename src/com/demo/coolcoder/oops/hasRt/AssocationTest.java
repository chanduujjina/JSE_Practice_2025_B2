package com.demo.coolcoder.oops.hasRt;

public class AssocationTest {
	
	public static void main(String[] args) {
		
		
		Bike bike = new Bike();
		
		bike.setBikeName("Test");
		bike.setDescription("Test Descrptiopion");
		
		Student student = new Student();
		student.setBike(bike);//assembling objects
		student.setName("test");
		student.setStdId(1);
		
		//fetch the detaild from whole and dependent objects
		System.out.println(student);
	}

}
