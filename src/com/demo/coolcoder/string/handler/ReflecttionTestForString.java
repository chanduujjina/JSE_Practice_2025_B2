package com.demo.coolcoder.string.handler;

import java.lang.reflect.Method;

public class ReflecttionTestForString {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class<?> cls = Class.forName("java.lang.StringBuffer");//loading the class at run time
		
		Method[] methods = cls.getMethods();
		
		for (Method method : methods) {
			System.out.println(method);
		}
	}

}
