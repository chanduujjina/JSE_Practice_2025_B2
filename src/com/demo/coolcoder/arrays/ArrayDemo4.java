package com.demo.coolcoder.arrays;

public class ArrayDemo4 {
	
	public static void main(String[] args) {
		
		int size = 200;
		
		int[] numberaray = addElements(size);//method call
		
		//add odd numbers to the array from 1 to 100
		
		int[] oddnumberArray = filterNumbers(size, numberaray,1);
		
		int[] evenNumbernumberArray = filterNumbers(size, numberaray,0);
		
		readFromArray(size/2, oddnumberArray);//method call
		
		System.out.println("---------------------------------");
		
		readFromArray(size/2, evenNumbernumberArray);//method call
		
		
	}

	/*
	 * private static int[] filterEvenNumbers(int size, int[] numberaray) { int
	 * evennumberArray []= new int [size/2]; int count = 0; for (int number :
	 * numberaray) {//enhance for loop
	 * 
	 * if (number % 2 == 0) { evennumberArray[count] = number; count++; } } return
	 * evennumberArray; }
	 * 
	 * private static int[] filterOddNumbers(int size, int[] numberaray) { int
	 * oddnumberArray []= new int [size/2]; int count = 0; for (int number :
	 * numberaray) {//enhance for loop
	 * 
	 * if (number % 2 == 1) { oddnumberArray[count] = number; count++; } } return
	 * oddnumberArray; }
	 */
	
	/**
	 * @param size
	 * @param numberaray
	 * @param remainder
	 * @return
	 * Purpose of this methhod to filter odd/even numbers bases on input remainder
	 */
	private static int[] filterNumbers(int size, int[] numberaray,int remainder) {
		int filternumberArray []= new int [size/2];
		int count = 0;
		for (int number : numberaray) {//enhance for loop
			
			if (number  % 2 == remainder) {
				filternumberArray[count] = number;
				count++;
			}
		}
		return filternumberArray;
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
