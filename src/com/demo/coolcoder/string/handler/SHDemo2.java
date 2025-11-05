package com.demo.coolcoder.string.handler;

public class SHDemo2 {
	
	public static void main(String[] args) {
		
		String name = "chandrasekhar";
		
		char ch1 = name.charAt(name.length()-1);
		
		System.out.println(ch1);
		
		int ind1 = name.lastIndexOf("a");
		System.out.println(ind1);
		
		String name1 = "chandu";
		
		String name2 = "sai";
		
		int compareTo = name2.compareTo(name2);
		System.out.println(compareTo);
	}

}
