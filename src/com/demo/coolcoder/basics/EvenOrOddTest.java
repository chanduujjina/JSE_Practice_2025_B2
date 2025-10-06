package com.demo.coolcoder.basics;

public class EvenOrOddTest {
	
	public static void main(String[] args) {
		
		
		int inputNumber = 100;
		
		//print the even and odd numbers b/w 1 to 100
		
		for (int i =1;i<=inputNumber;i++) {
			
			if (i % 2 == 0) {
				System.out.println(i+ " even number");
			}
			else {
				System.out.println(i+ " odd number");
			}
			
		}
		
		
		
	}

}
