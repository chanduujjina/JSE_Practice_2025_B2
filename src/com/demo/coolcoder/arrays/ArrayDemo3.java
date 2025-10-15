package com.demo.coolcoder.arrays;

public class ArrayDemo3 {
	
	public static void main(String[] args) {
		
		int size = 20;
		
		int[] numberaray = addElements(size);//method call
		
		readFromArray(size, numberaray);//method call
		
		
	}

	/**
	 * @param size
	 * @param numberaray
	 * purpose of this method to get the elements from array
	 */
	private static void readFromArray(int size, int[] numberaray) {
		//how to retrive elemnts from an array using legacy for loop
		
		for (int i = 0;i<size;i++) {
			System.out.println(numberaray[i]);
		}
	}

	/**
	 * @return
	 * Purpose of this method to add elements to the array
	 */
	
	private static int[] addElements(int size) {
		int numberarray [] = new int [size];
		
		int count = 0;
		
		for (int i = 1;i<=size;i++) {
			numberarray[count] = i;
			count++;
		}
		return numberarray;
	}

}
