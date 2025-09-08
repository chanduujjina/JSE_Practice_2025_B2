package com.demo.coolcoder;

import java.util.Objects;

public class Student {
	

	private int id;//0 
	
	private String name; //null
	
	private String gender;//null
	
	private String email;//null
	
	
	/*
	 * public Student() {//default constrctor
	 * 
	 * }
	 */
	
	//Constctor Overloading
	public Student(int id,String name,String gender,String email) {
		this(gender,email);//this must be the first statement.Constrctor Chaining
		this.id =id;//copy data from constuctor parameter to instance variable
		this.name = name;
		
		
	}
	
	private Student(String gender,String email) {
		
		this.gender = gender;
		this.email = email;
	}
	
	//setter method
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", gender=" + gender + ", email=" + email + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, gender, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && Objects.equals(gender, other.gender) && id == other.id
				&& Objects.equals(name, other.name);
	}

}
