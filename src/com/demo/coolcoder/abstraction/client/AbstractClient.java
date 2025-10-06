package com.demo.coolcoder.abstraction.client;

import com.demo.coolcoder.abstraction.BaseProvider;
import com.demo.coolcoder.abstraction.Vendor2;

public class AbstractClient {
	
	public static void main(String[] args) {
		
		
		BaseProvider baseProvider = new Vendor2();
		
		baseProvider.m1();
		
		//BaseProvider provider = new BaseProvider();
	}

}
