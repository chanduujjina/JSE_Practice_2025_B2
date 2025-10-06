package com.demo.coolcoder.basics;

public class ContinueDemo {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {//i =1,2,,3,4,5

			if (i>=4 && i<=6) {
				continue;
			}
			System.out.println(i);//1,2,3
			
		}
	}

}
