package com.demo.coolcoder.basics;

public class RightAngleTriangle {
	
	public static void main(String[] args) {
		
		int length = 10;
		
		
		for (int i =1;i<=length;i++) {//rows
			
			for (int j =1;j<=i;j++) {//colums
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
