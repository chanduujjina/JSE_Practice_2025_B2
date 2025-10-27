package com.demo.coolcoder.oops.poly.client;

public class OverLoadTrickyDemo1 {
	
	/*public void m1(int a,int b) {//exact match
		System.out.println("inside int,int param");
	}*/
	
	
	/*public void m1(int a,long b) {// more specific match
		System.out.println("inside int,long param");
	}*/
	
	
	
	/*public void m1(long a,int b) {// more specific match
		System.out.println("inside long,int param");
	}*/
	
	
	
	public void m1(long a,long b) {// more specific match
		System.out.println("inside long,long param");
	}
	
	public void m1(long ... a) {//fixes arbitary
		System.out.println("inide var arg");
	}
	
	public static void main(String[] args) {
		OverLoadTrickyDemo1 loadTrickyDemo1 = new OverLoadTrickyDemo1();
		loadTrickyDemo1.m1(1, 1,1);
	}

}
