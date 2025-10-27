package com.demo.coolcoder.oops.hasRt;

public class Bike {
	
	private String bikeName;
	
	private String description;

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		return "Bike [bikeName=" + bikeName + ", description=" + description + "]";
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
