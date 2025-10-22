package com.demo.coolcoder.oops.client;

import com.demo.coolcoder.oops.Sample;

public class EnCapsulationTest2 {
	
	public static void main(String[] args) {
		
		Sample sample1 = new Sample(1,"Hemoglobin","blood");//it will call parametorzed constctor
		
		Sample sample = new Sample();
		System.out.println(sample1);
		
		System.out.println("name::"+sample1.getSampleName());
		
		
		Sample sample2 = new Sample(2,"Test","Urine");
		System.out.println(sample2);
		System.out.println("name::"+sample2.getSampleName());
		
		Sample sample3 = new Sample(3,"Serum","Blood");
		
		System.out.println(sample3);
		
		System.out.println("name:"+sample3.getSampleName());
	}

}
