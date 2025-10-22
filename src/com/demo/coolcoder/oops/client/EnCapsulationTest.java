package com.demo.coolcoder.oops.client;

import com.demo.coolcoder.oops.Sample;

public class EnCapsulationTest {
	
	public static void main(String[] args) {
		
		Sample sample1 = new Sample();
		sample1.setSampleId(1);
		sample1.setSampleName("Hemoglobin");
		sample1.setSampleType("blood");
		
		System.out.println(sample1);
		
		System.out.println("name::"+sample1.getSampleName());
		
		
		Sample sample2 = new Sample();
		sample2.setSampleId(2);
		sample2.setSampleName("Test");
		sample2.setSampleType("Urine");
		System.out.println(sample2);
		System.out.println("name::"+sample2.getSampleName());
		
		Sample sample3 = new Sample();
		sample3.setSampleId(3);
		sample3.setSampleName("Serum");
		sample3.setSampleType("Blood");
		System.out.println(sample3);
		
		System.out.println("name:"+sample3.getSampleName());
	}

}
