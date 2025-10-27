package com.demo.coolcoder.oops.abstraction.client;

import com.demo.coolcoder.oops.abstraction.BaseProvider;
import com.demo.coolcoder.oops.abstraction.Vendor3;


public class InterfaceTest {
	
	public static void main(String[] args) {
		
		BaseProvider baseProvider = new Vendor3();
		
		//static method
		BaseProvider.m1();
		
		baseProvider.m2();
		
		baseProvider.m3();
		
	}

}
