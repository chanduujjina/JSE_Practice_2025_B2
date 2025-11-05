package com.demo.coolcoder.string.handler;

public class SHDemo5 {

	public static void main(String[] args) {

		// valueOf method

		char chArray[] = { 'c', 'h', 'a', 'n', 'd', 'u' };

		// convert char array to String

		String name = String.valueOf(chArray);
		
		System.out.println(name);
		
		String valueOf = String.valueOf(chArray, 1, 5);
		System.out.println(valueOf);
		
		//convert int to String format //1 -> "1"
		
		String valueOf2 = String.valueOf("123");
		System.out.println(valueOf2);
	}

}
