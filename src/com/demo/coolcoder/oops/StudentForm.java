package com.demo.coolcoder.oops;

public class StudentForm {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();//creating object(instatiating)
		Student.consultanceName = "CC";
		student1.setStdId(1);
		
		student1.setStdName("Sai Teja");
		student1.setGender("male");
		
		student1.setAddress("test1");
		System.out.println(student1.consultanceName);
		
		System.out.println(student1);
		
		Student student2 = new Student();
		
		student2.setStdId(2);
		
		student2.setStdName("GopiChand");
		student2.setGender("male");
		
		student2.setAddress("test2");
		
		System.out.println(student2.consultanceName);
		
		
		System.out.println(student2);
		
		Student student3 = new Student();
		
		student3 = null;
	}

}
