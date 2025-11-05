package com.demo.coolcoder.string.handler;

public class SHDemo3 {
	
	public static void main(String[] args) {
		
		String valueArray [] = {"test123","sample","test128","sample1","test129"};
		
		//print the values start with test
		
		for (String name : valueArray) {
			
			if (name.startsWith("test")) {//find with Prefix
				System.out.println(name);
			}
			
		}
	}

}
