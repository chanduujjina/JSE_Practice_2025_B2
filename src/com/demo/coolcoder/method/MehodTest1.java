package com.demo.coolcoder.method;

public class MehodTest1 {
	
	public static void main(String[] args) {
		
		m1(1,1);//method call
		
		int result = addValues(1,1,2);//method call
		
		System.out.println(result);
		
	}
	
	public static void m1(int a,int b) {//method definition,void method
		System.out.println("value :"+a);
		
		System.out.println("b value :"+b);
	}
	
	public static int addValues(int a,int b,int c) {//non void method
		int result = a+b+c;
		return result;
	}
	

}
