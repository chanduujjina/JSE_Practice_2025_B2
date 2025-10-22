package com.demo.coolcoder.oops.poly;

public class MethodOverLoad {
	
	public Integer compute(int a,String b) {
		return a+Integer.valueOf(b);
	}
	
	public Integer compute(int a,int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		MethodOverLoad methodOverLoad = new MethodOverLoad();
		Integer val1 = methodOverLoad.compute(1,"1");
		
		Integer val2 = methodOverLoad.compute(1,1);
		
		System.out.println(val1);
		
		System.out.println(val2);
	}

}
