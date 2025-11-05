package com.demo.coolcoder.string.handler;

public final class Student {


	private final int id;//decalration and not intializing
	
	private final String stdName;
	
	private final String rollName;
	
	
	
	public Student(int id,String stdName,String rollName) {
		this.id = id;
		this.stdName = stdName;
		this.rollName =rollName;
	}
	
	
	public int getId() {
		return id;
	}



	public String getStdName() {
		return stdName;
	}



	public String getRollName() {
		return rollName;
	}
	

}
