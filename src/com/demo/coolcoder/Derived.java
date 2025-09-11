package com.demo.coolcoder;

public class Derived extends Base {
	
	/*
	 * public Derived(){
	 * super();//it will looking for default constrctor of Parent
	 * }
	 */

	private int subId;

	private String subName;
	
	public Derived(int subId,String subName,int id,String name) {
		super(id,name);//it will parametorised constrctor of Parent
		this.subId = subId;
		this.subName =subName; 
		
	}
	

	public int getSubId() {
		return subId;
	}

	public void setSubId(int subId) {
		this.subId = subId;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

}
