package com.demo.coolcoder.oops.inheritance;

public class Derived1 extends Base {
	
	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	public void setParentId(int id) {
		super.setId(id);
	}
	
	public void setParentName(String name) {
		super.setName(name);
	}
	
	public int getParentId() {
		return super.getId();
	}
	
	public String getParentName() {
		return super.getName();
	}

}
