package com.demo.coolcoder.basics;

public class EquilateralDemo {
	
	public static void main(String[] args) {
		
		
		int consoleSize = 180;
		for (int i =1;i<=10;i++) {//i =1,2,3
			
			for (int j = 1;j<=consoleSize/2-i;j++) {//(j =1 ..... 87)
				System.out.print(" ");
			}
			
			for (int k =1;k<=i;k++) {
				System.out.print("* ");
			}
			
			System.out.println();
			
		}
	}

}
