package com.demo.coolcoder.oops.hasRt;

public class Student {
	
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", bike=" + bike + "]";
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	private int stdId;
	
	private String name;
	
	private Bike bike;

}
