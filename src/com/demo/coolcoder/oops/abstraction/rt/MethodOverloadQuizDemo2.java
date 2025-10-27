package com.demo.coolcoder.oops.abstraction.rt;

public class MethodOverloadQuizDemo2 {
	
	public static void main(String[] args) {
		TestOverLoad testOverLoad = new TestOverLoad();
		testOverLoad.getIntance("test");
		testOverLoad.getIntance();
	}

}



class Base {

}

class Derived extends Base {
	
}

class TestOverLoad {
	public Base getIntance(String type) {
		System.out.println("getIntance string");
		return new Derived();
	}
	
	public Derived getIntance() {
		System.out.println("getIntance with out param");
		return new Derived();
	}
}
