package com.demo.coolcoder.string.handler;

public class SHDemo8 {
	
	public static void main(String[] args) {
		
		String filePath = "c://chandu/java/abc.txt";
		
	     //fileName;
		
		String value = "chandu";
		
		String subVal = value.substring(0, 4);
		System.out.println(subVal);
		
		
		//find the startIndex
		
		int lastIndexOf = filePath.lastIndexOf("/");
		
		System.out.println(lastIndexOf);
		
		String fileName = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
		
		System.out.println(fileName);
		
		
		String value1 = "$test$test1";
		
		String replace = value1.replace("$", "123");
		
		System.out.println(replace);
		
	}

}
