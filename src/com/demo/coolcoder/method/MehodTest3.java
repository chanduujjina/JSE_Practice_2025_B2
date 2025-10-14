package com.demo.coolcoder.method;

public class MehodTest3 {
	
	public static void main(String[] args) {
		
		//find the sum of numbers
		
		int sum = add(1,2,3,4,5);
		System.out.println(sum);
		
		//find the average or mean of numbers
		
		double result = mean(1,2,3,4,5);
		System.out.println(result);
		
	}

	private static double mean(int i, int j, int k, int l, int m) {
		int add = add(1,2,3,4,5);
		return add/5;
	}

	private static int add(int i, int j, int k, int l, int m) {
		return i+j+k+l+m;
	}

	
	
	
	

}
