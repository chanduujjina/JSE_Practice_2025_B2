package com.demo.coolcoder.object.method;

public class DeepCloneDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Sample sample1 = new Sample(1, "test1");
		
		System.out.println(sample1);//1,test1
		
		Sample sample2=(Sample)sample1.clone();
		System.out.println(sample2);//1,test1
		sample2.setSampleName("test2");
		
		System.out.println(sample2);//1,test2
		
		System.out.println(sample1);//1,test2
		
	}
	
	

}
