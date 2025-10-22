package com.demo.coolcoder.oops.inheritance.client;

import com.demo.coolcoder.oops.inheritance.Derived1;

public class InheritanceDemo2 {

	public static void main(String[] args) {
		Derived1 derived1 = new Derived1();
		derived1.setId(1);
		derived1.setName("test child");

		derived1.setParentId(1);

		derived1.setParentName("test Parent");

		System.out.println("child name:" + derived1.getName());

		System.out.println("child id:" + derived1.getId());

		System.out.println("parent name:" + derived1.getParentName());

		System.out.println("parent id:" + derived1.getParentId());
	}

}
