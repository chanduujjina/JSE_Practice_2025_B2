package com.demo.coolcoder.string.handler;

public class TestFinalKeyword {
	
	/*
	 * private final String value="test";
	 * 
	 * value = "test1";
	 */
	
	public static void main(String[] args) {
		
		
	}

}

class Test {
	public final void m1() {
		System.out.println("inside Test m1 method");
	}
}

class TestImpl extends Test {
	
	/*@Override
	public  void m1() {
		System.out.println("inside Test m1 method");
	}
	*/
}

final class Root {
	
	
}


/*class RootImpl1 extends Root {
	
}*/
