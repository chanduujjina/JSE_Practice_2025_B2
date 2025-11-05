package com.demo.coolcoder.string.handler;

public class SBDemo3 {
	
	public static void main(String[] args) {
		
		String value = "java";
		
		StringBuilder sb1 = new StringBuilder(value);
		
		
		sb1.insert(value.length(), " is programming langugage");
		
		System.out.println(sb1);
		
		
		StringBuilder sb2 = new StringBuilder("chandu");
		
		char charArray [] = {'u','j','j','i','n','a'};
		sb2.append(" ");
		
		sb2.insert(sb2.length(), charArray);
		
		System.out.println(sb2);
		
		
	}

}
