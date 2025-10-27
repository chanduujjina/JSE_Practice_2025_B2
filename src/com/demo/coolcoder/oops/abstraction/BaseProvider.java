package com.demo.coolcoder.oops.abstraction;

public interface BaseProvider {
	
	static void m1() {
		System.out.println("inside m1 method BaseProvider");
	}
	
	void m2();//abtract method
	
	
	default void m3() {
		System.out.println("inside m3 method BaseProvider");
	}

}
