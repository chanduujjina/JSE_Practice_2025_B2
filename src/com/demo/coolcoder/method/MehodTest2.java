package com.demo.coolcoder.method;

public class MehodTest2 {
	
	public static void main(String[] args) {
		
		//method can return multiple values -> no
		
		
		
		String result = getValue(10);
		
		System.out.println("result :"+result);
		
		int result1 = getValAsInt("30");
		
		System.out.println(result1);
		
	}

	private static int getValAsInt(String value) {
		
		return Integer.valueOf(value);
	}

	private static String getValue(int value) {
		
		
		return String.valueOf(value);
	}
	
	
	

}
