package com.demo.coolcoder.polymorphism.client;

import com.demo.coolcoder.polymorphism.Base;
import com.demo.coolcoder.polymorphism.Child1;

public class RuntimePloyClinet {
	
	public static void main(String[] args) {
		
		//with super class reference we can hold sub class object
		
		Base base = new Child1();
		
		base.m1("test");
		
		base.m2("test1");
		
	}

}
