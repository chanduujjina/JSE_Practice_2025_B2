package com.demo.coolcoder.hasrealtion.client;

import com.demo.coolcoder.hasrealtion.Car;
import com.demo.coolcoder.hasrealtion.Engine;
import com.demo.coolcoder.hasrealtion.Wheel;

public class AggregationClient {
	
	public static void main(String[] args) {
		
		
		Engine engine = new Engine();
		
		engine.setEngineId("eng0001");
		engine.setType("test engine");
		
		
		Wheel wheel = new Wheel();
		
		wheel.setWeelName("test wheeel");
		
		wheel.setWheelType("test wheel type");
		
		 Car car = new Car(1, "test desc", "test", engine, wheel);
		 
		 System.out.println("engine :"+car.getEngine());
		 
		 System.out.println("wheel :"+car.getWheel());
	}
	

}
