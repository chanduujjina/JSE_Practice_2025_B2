package com.demo.coolcoder.abstraction;

public interface BaseProvider {
	
	default void m1() {
		System.out.println("inside m1 default method");
	}
	
	static void m2() {
		System.out.println("inside m2 static method");
	}
	
	
	 void m3();//design
	
	

}
