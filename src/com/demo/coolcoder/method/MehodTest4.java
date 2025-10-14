package com.demo.coolcoder.method;

public class MehodTest4 {
	
	public static void main(String[] args) {
		
		
		
		int res1 = add(1,2);
		System.out.println(res1);
		
		int res2 = add(1,2,3);
		System.out.println(res2);
		
		int res3 = add(1,2,3,4);
		System.out.println(res3);
		
		int res4 = add(1,2,3,4,5,6,6,6,7,8,8,8,9);
		System.out.println(res4);
		
	}

	/*
	 * private static int add(int i, int j, int k, int l) {
	 * 
	 * return i+j+k+l; }
	 * 
	 * private static int add(int i, int j, int k) { return i+j+k;
	 * 
	 * }
	 * 
	 * private static int add(int i, int j) {
	 * 
	 * return i+j; }
	 */

	

	
   public static int add(int ... values) {// var arags
	   int result = 0;
	   for (int value : values) {
		   result =result+value; 
	   }
	   return  result;
   }
	
	
	
	

}
