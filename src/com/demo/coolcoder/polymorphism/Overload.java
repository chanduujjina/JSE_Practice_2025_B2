package com.demo.coolcoder.polymorphism;

public class Overload {

	public void m1(int a,long b) {
       System.out.println("inside m1 method int long");
	}

	public void m1(long a,long b) {
		System.out.println("inside m1 method long long");
	}
	
	public void m1(String val) {
		System.out.println("inside m1 method string");
	}
	
	

}
