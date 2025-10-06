package com.demo.coolcoder.reflection;

import java.lang.reflect.Method;

public class StringDemoReflection {
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> cls = Class.forName("java.lang.Object");//class loader
		
		Method[] declaredMethods = cls.getDeclaredMethods();
		
		for (Method method : declaredMethods) {
			System.out.println(method);
		}
	}

}
