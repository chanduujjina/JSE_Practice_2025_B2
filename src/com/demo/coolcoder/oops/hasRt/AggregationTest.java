package com.demo.coolcoder.oops.hasRt;

public class AggregationTest {
	
	public static void main(String[] args) {
		
		Engine engine = new Engine();
		
		Steering steering = new Steering();
		
		Car car = new Car(engine, steering);
		
		car.startTheCar();
		
		car.goInDirection();
	}

}
