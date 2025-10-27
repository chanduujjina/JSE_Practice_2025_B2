package com.demo.coolcoder.oops.poly.client;

public class OverLoadTrickyDemo2 {
	
	public void m1(short a,short b) {
		System.out.println("Inside m1 short,short");
	}
	
	public void m1(byte a,byte b) {
		System.out.println("Inside m1 byte,byte");
	}
	
	/*
	 * public void m1(int a,int b) { System.out.println("Inside m1 int,int"); }
	 */
	
	
	
	public static void main(String[] args) {
		OverLoadTrickyDemo2 loadTrickyDemo1 = new OverLoadTrickyDemo2();
		//loadTrickyDemo1.m1(1, 1);
	}

}
