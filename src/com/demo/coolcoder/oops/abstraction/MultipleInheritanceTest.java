package com.demo.coolcoder.oops.abstraction;

public class MultipleInheritanceTest {
	
	public static void main(String[] args) {
		Child child = new Child();
		child.m1();
	}
}


interface Parent1 {
	
	void m1();//design
}


interface Parent2 {
	
	void m1();//design
}

class Child implements Parent1,Parent2{
	public void m1() {
		System.out.println("inside m1 method Child 1");
	}
}
