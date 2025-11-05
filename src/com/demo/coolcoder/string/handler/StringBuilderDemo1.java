package com.demo.coolcoder.string.handler;

public class StringBuilderDemo1 {
	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("test");
		
		sb1.append(" test1");
		
		System.out.println(sb1);
		
		//how to convert from String Builder to String
		
		
		String value = sb1.toString();
		
		
		StringBuilder builder2 = new StringBuilder("chandu");
		
		StringBuilder reverse = builder2.reverse();
		
		System.out.println(reverse);
		
		
		
	}

}
