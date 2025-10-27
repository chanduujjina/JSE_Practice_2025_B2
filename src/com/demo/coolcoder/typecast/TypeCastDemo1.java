package com.demo.coolcoder.typecast;

public class TypeCastDemo1 {
	
	public static void main(String[] args) {
		
		int a = 10;
		
		long b = a; //long b = (int) a auto casting/widening/Upcasting
		
		long c= 3000000;
		
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		
		int d = (int)c;//narrowing or downcasting
		
		double  e = 10.5;
		int f = (int)e;
		
		System.out.println(f);
		
	}

}
