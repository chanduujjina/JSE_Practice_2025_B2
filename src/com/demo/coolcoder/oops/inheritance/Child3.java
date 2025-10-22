package com.demo.coolcoder.oops.inheritance;

public class Child3 extends Parent {

	// asset

	private int childId;

	private String childName;

	public int getChildId() {
		return childId;
	}

	public void setChildId(int childId) {
		this.childId = childId;
	}

	public String getChildName() {
		return childName;
	}

	public void setChildName(String childName) {
		this.childName = childName;
	}

	public void m2() {
		System.out.println("Inside Child3 m2 method");
	}

}
