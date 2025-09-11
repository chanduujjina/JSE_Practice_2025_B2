package com.demo.coolcoder;

public class Child1 extends Parent {
	
	
   /*
    * public Child1(){
    * super();// it will super class default constuctor
    * }
    */

	private int childId;
	
	
	public void m2() {
		System.out.println("inside m2 method");
	}
	
	
	
	public int getChildId() {
		return childId;
	}


	public void setChildId(int childId) {
		this.childId = childId;
	}

}
