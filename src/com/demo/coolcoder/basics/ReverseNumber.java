package com.demo.coolcoder.basics;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int inputNumber = 521;//12
		int reverse = 0;//5
		
		while(inputNumber > 0) {//condtion
			int remainnder = inputNumber%10;//5,2
			reverse = reverse*10+remainnder;//5,52
			inputNumber =inputNumber/10;
			
		}
		
		System.out.println(reverse);
		
		
	}

}
