package com.demo.coolcoder.object.method;

public class ShalloCloneDemo {
	public static void main(String[] args) {
		
		Sample sample1 = new Sample(1, "test1");
		
		System.out.println(sample1);//1,test1
		
		Sample sample2 = sample1;//shallo clone
		
		sample2.setSampleName("test2");
		
		System.out.println(sample2);//1,test2
		
		System.out.println(sample1);//1,test2
	}

}
