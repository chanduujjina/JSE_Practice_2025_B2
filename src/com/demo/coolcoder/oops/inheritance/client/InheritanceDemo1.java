package com.demo.coolcoder.oops.inheritance.client;

import com.demo.coolcoder.oops.inheritance.Child1;

public class InheritanceDemo1 {
	
	public static void main(String[] args) {
		
		
		Child1 child1 = new Child1();
		
		//change the state of object -> can add,update,delete data inside object
		//child class along with self it can also change the state of parent object also
		//child can access/get/retieve parent asset also
		
		//changing state of parent object from child
		
		child1.setParentId(1);
		child1.setName("test Parent");
		
		child1.setChildId(1);
		child1.setChildName("test child");
		
		
		//retrive parent details using child
		
		System.out.println("parent name:"+child1.getName());
		
		System.out.println("child name:"+child1.getChildName());
		
		child1.m1();
		child1.m2();
	}

}
