package com.demo.coolcoder.basics;

public class DataTypesTest {
	
	public static void main(String[] args) {
		
		
		int a = (int)10000.5;
		
		System.out.println(a);
		
		int b = (int)0.5;
		
		System.out.println(b);
		
		
		int c = 10000;
		short d = (short)c;//narrowing
		
		int e =450000;
		
		long f = e;//widening -> auto casting
	}

}
