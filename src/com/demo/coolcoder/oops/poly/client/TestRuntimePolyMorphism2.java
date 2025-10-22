package com.demo.coolcoder.oops.poly.client;

import com.demo.coolcoder.oops.poly.BaseBank;
import com.demo.coolcoder.oops.poly.SBI;

public class TestRuntimePolyMorphism2 {
	
	public static void main(String[] args) {
		
	BaseBank baseBank = new SBI();//creating object in an abstract way
	//you can hold subject with super class reference
	
	baseBank.m1();
	
	baseBank.m2();
	
	
	}

}
