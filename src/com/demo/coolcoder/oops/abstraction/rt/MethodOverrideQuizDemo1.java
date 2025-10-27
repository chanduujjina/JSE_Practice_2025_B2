package com.demo.coolcoder.oops.abstraction.rt;

public class MethodOverrideQuizDemo1 {
	
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.getInstance();
	}

}



class Base1 {

}

class Derived1 extends Base1 {
	
}

class Parent {
	
	public Base1 getInstance() {
		System.out.println("getInstance Parent class");
		return new Derived1();
	}
	
}

class Child extends Parent {
	
	@Override
	public Derived1 getInstance() {
		System.out.println("getInstance child class");
		return new Derived1();
	}
	
	
	
	// CE,RE,comiple free
}
