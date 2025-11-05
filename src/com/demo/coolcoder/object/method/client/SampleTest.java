package com.demo.coolcoder.object.method.client;

import com.demo.coolcoder.object.method.Sample;

public class SampleTest {
	
	public static void main(String[] args) {
		
		Sample sample1 = new Sample(1,"test");
		
		System.out.println(sample1.hashCode());
		
		System.out.println(sample1);
		
		
		Sample sample2 = new Sample(1,"test");
		
		System.out.println(sample2);
		
		
		System.out.println(sample2.hashCode());
		
		if (sample1.hashCode() == sample2.hashCode() && sample1.equals(sample2)) {
			System.out.println("both objects are same");
		}
		else {
			System.out.println("both objects may not same");
		}
	}

}
