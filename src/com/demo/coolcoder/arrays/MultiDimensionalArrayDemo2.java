package com.demo.coolcoder.arrays;

public class MultiDimensionalArrayDemo2 {
	
	public static void main(String[] args) {
		
		//1 block 2 rows 2 columns
		
		int numberArray [][] = {{1,2},{3,4}};
		
		//1 block 3 rows and 4 columns
		
		
		int numberArray1 [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		//2 blocks 2 rows and 3 column
		
		int numberArray2 [][][] = {{{1,2,3},{4,5,6}},{{4,3,1},{7,8,1}}};
		
		//retrive data using multidimensional array using legacy for loop
		
		//System.out.println(numberArray[0][1]);
		
		
		//print all the elemnts in 2 dimensional array
		 oneBlockArrayRead(numberArray1);
		  
		  readFromMultiBlock(numberArray2);
		 
		
	}

	private static void readFromMultiBlock(int[][][] numberArray2) {
		for (int[][] block:numberArray2) { //block
			  
			  for (int[] row:block) {//row
				  
				  for (int column:row) {//column
					 
					  System.out.print(column + " ");
				  }
				  System.out.println();
			  }
			 
		  }
	}

	private static void oneBlockArrayRead(int[][] numberArray1) {
		
		for (int row[] :numberArray1) {
			for (int num : row) {
				System.out.print(num+ " ");
			}
			System.out.println();
			
		}
	}

}
