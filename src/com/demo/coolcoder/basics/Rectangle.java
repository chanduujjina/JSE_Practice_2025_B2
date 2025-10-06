package com.demo.coolcoder.basics;

public class Rectangle {
	
	public static void main(String[] args) {
		
		int length = 3;
		
		int bredth = 5;
		
		for (int i =1;i<=length;i++) {//rows
			
			for (int j =1;j<=bredth;j++) {//colums
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
