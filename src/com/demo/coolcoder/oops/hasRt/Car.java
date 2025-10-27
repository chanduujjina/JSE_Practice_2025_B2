package com.demo.coolcoder.oops.hasRt;

public class Car {
	
	
	private Engine engine;
	
	private Steering steering;
	
	public Car(Engine engine,Steering steering) {
		this.engine = engine;
		this.steering = steering;
	}
	
	public void startTheCar() {
		engine.startEngine();
	}
	
	public Engine getEngine() {
		return engine;
	}

	public Steering getSteering() {
		return steering;
	}

	public void goInDirection() {
		steering.moveStreering();
	}
	

}
