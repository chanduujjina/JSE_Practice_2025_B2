package com.demo.coolcoder.oops.inheritance;

public class Parent {

	// asset -> properties/state and behaviour

	private int parentId;

	private String name;

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void m1() {
		System.out.println("inside parent m1");
	}

}
