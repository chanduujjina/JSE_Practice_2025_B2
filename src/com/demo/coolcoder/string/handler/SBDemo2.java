package com.demo.coolcoder.string.handler;

public class SBDemo2 {
	
	public static void main(String[] args) {
		
		String value = "smaplee";
		
		StringBuilder sb1 = new StringBuilder(value);
		
		
		sb1.deleteCharAt(value.length()-3);
		
		System.out.println(sb1);
		
		//trim -> it will remove trailing the trailing and leading spaces
		
		
		StringBuilder sb2 = new StringBuilder("test1 ");//UI
		
		StringBuilder sb3 = new StringBuilder(" test1");//db
		
		boolean equals = sb2.toString().trim().equals(sb3.toString().trim());
		
		System.out.println(equals);
		
       StringBuilder sb4 = new StringBuilder("test");//rest api
		
		StringBuilder sb5 = new StringBuilder("TEST");//kafka
		
		boolean equals2 = sb4.toString().equalsIgnoreCase(sb5.toString());
		
		System.out.println(equals2);
		
	}

}
