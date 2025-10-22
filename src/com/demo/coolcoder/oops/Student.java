package com.demo.coolcoder.oops;

public class Student {//pascal case

	private String stdName;//camel case,object level data
	
	private int stdId;
	
	private String gender;
	
	private String address;
	
	public static String consultanceName;//class level data
	
	
	
	
	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdId=" + stdId + ", gender=" + gender + ", address=" + address + "]";
	}

}
