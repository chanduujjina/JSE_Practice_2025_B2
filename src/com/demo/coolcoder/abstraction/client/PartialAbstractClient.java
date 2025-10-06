package com.demo.coolcoder.abstraction.client;

import com.demo.coolcoder.abstraction.BaseService;
import com.demo.coolcoder.abstraction.BaseServiceImpl2;

public class PartialAbstractClient {
	
	public static void main(String[] args) {
		
		
	BaseService baseService = new BaseServiceImpl2();
	baseService.m2();
	
	baseService.m1();
	
	
	//BaseService service = new BaseService();
	
	}

}
