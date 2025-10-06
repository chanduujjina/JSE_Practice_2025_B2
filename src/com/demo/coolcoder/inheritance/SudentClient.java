package com.demo.coolcoder.inheritance;

public class SudentClient {

	public static void main(String[] args) {

		Student s1 = new Student(1,"test","male","test");

		/*
		 * s1.setId(1);
		 * 
		 * s1.setName("test");
		 * 
		 * s1.setGender("male");
		 * 
		 * s1.setEmail("test@gamil.com");
		 */
		System.out.println(s1.getName());
		
		System.out.println("s1 hashcode :"+s1.hashCode());

		Student s2 = new Student(2,"test1","male","test1@gmail.com");

		/*
		 * s2.setId(2);
		 * 
		 * s2.setName("test1");
		 * 
		 * s2.setGender("male");
		 * 
		 * s2.setEmail("test1@gamil.com");
		 */
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println("s2 hashcode :"+s2.hashCode());
		
		
		Student s3 = new Student(1,"test","male","test");

		/*
		 * s3.setId(1);
		 * 
		 * s3.setName("test");
		 * 
		 * s3.setGender("male");
		 * 
		 * s3.setEmail("test@gamil.com");
		 */
		
		System.out.println(s3);
		
		System.out.println("s3 hashcode :"+s3.hashCode());
		
		if (s1.hashCode() == s3.hashCode() && s1.equals(s3)) {
			System.out.println("s1 and s3 objects are same");
		}
		else {
			System.out.println("s1 and s3 objects are diffrent");
		}

	}

}
