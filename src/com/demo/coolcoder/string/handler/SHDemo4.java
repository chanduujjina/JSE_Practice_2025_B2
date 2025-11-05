package com.demo.coolcoder.string.handler;

public class SHDemo4 {
	
	public static void main(String[] args) {
		
		String valueArray [] = {"123test","sample","128test","sample1","129test"};
		
		//print the values start with test
		
		for (String name : valueArray) {
			
			if (name.endsWith("test")) {//find a string with suffix
				System.out.println(name);
			}
			
		}
		
		String valueArray1 [] = {"#test123","sample","$test128","sample1","*test129"};
		
		
		for (String value : valueArray1) {
			if (value.startsWith("test", 1)) {//filter with prefix but ignore first charcater
				System.out.println(value);
			}
		}
	}

}
