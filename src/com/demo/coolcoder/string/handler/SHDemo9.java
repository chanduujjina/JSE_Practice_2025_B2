package com.demo.coolcoder.string.handler;

public class SHDemo9 {
	
	public static void main(String[] args) {
		//how to reverse String
		
	    String name = "chandu";
	    
	   System.out.println(name.length());
	   
	   reverseStringUsingCharAt(name);
	   System.out.println();
	   System.out.println("-----------------");
	   
	    char[] charArray = name.toCharArray();
	    
	    for (int i = charArray.length-1 ; i>=0;i--) {
	    	System.out.print(charArray[i]);
	    }
	}

	private static void reverseStringUsingCharAt(String name) {
		for (int i = name.length()-1; i>=0; i--) {
			   System.out.print(name.charAt(i));
		   }
	}

}
