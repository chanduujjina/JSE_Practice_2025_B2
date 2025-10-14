package com.demo.coolcoder.operators;

public class RealtionOperatorDemo2 {
	
	public static void main(String[] args) {
		
		
		int a = 30;
		int b = 40;
		
		String type = "lesser";
		boolean val = compareData(a,b,type);
		System.out.println(val);
	}

	private static boolean compareData(int a, int b, String type) {
		
		switch (type) {
		case "equal": {
			return a == b;
			
		}
		case "not equal": {
			return a != b;
			
		}
		
		case "lesser": {
			return a < b;
			
		}
		
		case "lesserOrEqual": {
			return a <= b;
			
		}
		
		case "greater": {
			return a > b;
			
		}
		
		case "greaterOrEqual": {
			return a >= b;
			
		}
		
		default:
			System.out.println("invalid operation");
			
		}
		
		return false;
	}

}
