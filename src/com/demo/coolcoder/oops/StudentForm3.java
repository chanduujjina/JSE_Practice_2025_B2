package com.demo.coolcoder.oops;

public class StudentForm3 {
	
	public static void main(String[] args) {
		Student student1 = new Student();
        student1.setStdId(1);
		student1.setStdName("Sai Teja");
		
		setStudentInformation(student1);
		
		System.out.println(student1);
		
	}
	
	public static  void setStudentInformation(Student student1) {
		student1 = null;
	}

}
