package com.demo.coolcoder;

public class InheritanceDemo1 {
	
	public static void main(String[] args) {
		
		Child1 child1 = new Child1();// creating object
		
		child1.setParentId(1);
		
		child1.m1();
		
		child1.setChildId(2);
		
		child1.m2();
	}

}
