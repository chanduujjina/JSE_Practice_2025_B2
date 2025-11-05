package com.demo.coolcoder.string.handler;

public class SHDemo7 {
	
	public static void main(String[] args) {
		
		String value = "this is %s";
		
		String format = String.format(value, "siva");
		System.out.println(format);
		
		
	   String skillSet = "java,.net,python,typescript";
	   
	   //convert comma separared Strings to array using split method
	   
	   String[] skillsArray = skillSet.split(",");
	   
	   
	   for (String skill : skillsArray) {
		   System.out.println(skill);
	   }
	   
		
	}

}
