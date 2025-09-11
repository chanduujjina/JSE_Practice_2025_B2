package com.demo.coolcoder;

public class InheritanceDemo2 {
	
	public static void main(String[] args) {
		
		Derived derived = new Derived(1, "child", 1, "parent");//creating object
		
		System.out.println("child name:"+derived.getSubName());
		
		System.out.println("parent name:"+derived.getName());
		
		
	}

}
