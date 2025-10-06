package com.demo.coolcoder.basics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int inputNumber = 121;//12
		int original = inputNumber;
		int reverse = 0;//5//121
		
		while(inputNumber > 0) {//condtion
			int remainnder = inputNumber%10;//5,2
			reverse = reverse*10+remainnder;//5,52
			inputNumber =inputNumber/10;
			
		}
		
		System.out.println(reverse);
		
		if (original == reverse) {
			System.out.println("it is a palindrome");
		}
		
		else {
			System.out.println("it is not a palindrome");
		}
		
		
	}

}
