package com.demo.coolcoder.basics;

public class PrimeNumberTest {
	
	public static void main(String[] args) {
		
		
		int inputNumber = 11;
		
		int factorCount = 0;
		
		for (int i =1;i<=inputNumber;i++) {
			if (inputNumber % i == 0) {
				factorCount = factorCount+1;
			}
		}
		
		
		if (factorCount == 2) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("it is not a prime number");
		}
	}

}
