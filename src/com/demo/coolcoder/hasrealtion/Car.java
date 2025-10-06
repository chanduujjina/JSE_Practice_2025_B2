package com.demo.coolcoder.hasrealtion;

public class Car {
	
	private int carId;
	
	private String carDesc;
	
	private String carType;
	
	private Engine engine;
	
	private Wheel wheel;

	public Car(int carId, String carDesc, String carType, Engine engine, Wheel wheel) {
		super();
		this.carId = carId;
		this.carDesc = carDesc;
		this.carType = carType;
		this.engine = engine;
		this.wheel = wheel;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public String getCarDesc() {
		return carDesc;
	}

	public void setCarDesc(String carDesc) {
		this.carDesc = carDesc;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Wheel getWheel() {
		return wheel;
	}

	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
	
	
	
	

}
