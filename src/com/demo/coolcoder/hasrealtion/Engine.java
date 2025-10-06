package com.demo.coolcoder.hasrealtion;

public class Engine {
	
	private String engineId;
	
	private String type;

	public String getEngineId() {
		return engineId;
	}

	public void setEngineId(String engineId) {
		this.engineId = engineId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Engine [engineId=" + engineId + ", type=" + type + "]";
	}

}
