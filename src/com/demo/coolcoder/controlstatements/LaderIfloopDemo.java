package com.demo.coolcoder.controlstatements;

public class LaderIfloopDemo {
	
	public static void main(String[] args) {
		
		int a = 30;
		
		int b = 40;
		
		
		String type = "test";
		
		int result = compute(a,b,type);
		
		System.out.println(result);
	}

	private static int compute(int a, int b, String type) {
		
		int result = 0;
		if (type.equals("add")) {
			result = a+b;
		}
		else if (type.equals("sub")) {
			result = a-b;
		}
		
		else if (type.equals("mul")) {
			result = a*b;
		}
		
		else if (type.equals("div")) {
			result = a/b;
		}
		
		else if (type.equals("rem")) {
			result = a%b;
		}
		
		else {
			System.out.println("Invalid type provided");
		}
		
		return result;
	}

}
