package com.demo.coolcoder.string.handler;

public class StringHandlerDemo1 {
	
	public static void main(String[] args) {
		
		String value1 = "test";//literal
		
		String value2 = new String("test").intern();//object
		
		String value3 = "test";//literal
		
		String value4 = new String("test");//object
		
		String value5 = "test1";
		
		
		boolean result1 = value1 == value2;
		
		System.out.println(result1);
		
		boolean result2 = value1.equals(value2);
		System.out.println(result2);
		
		boolean result3 =value1 == value3;
		System.out.println(result3);
		
		boolean result4 =value1 == value5;
		System.out.println(result4);
	}
	
	

}
