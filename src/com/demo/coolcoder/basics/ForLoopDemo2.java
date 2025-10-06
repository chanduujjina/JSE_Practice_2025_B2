package com.demo.coolcoder.basics;

public class ForLoopDemo2 {
	
	public static void main(String[] args) {
		
		int input = 3;
		
		for (int i =1;i<=input;i++) {//rows
			
			for (int j =1;j<=input;j++) {//colums
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
