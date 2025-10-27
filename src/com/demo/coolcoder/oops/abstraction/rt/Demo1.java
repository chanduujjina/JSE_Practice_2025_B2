package com.demo.coolcoder.oops.abstraction.rt;

public class Demo1 {

}


interface Test1 {
	void m1();
}

interface Test2 extends Test1{
	void m2();
}


class Test3 {
	
	
}

class Test4 extends Test3 implements Test1,Test2{

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}
	
}