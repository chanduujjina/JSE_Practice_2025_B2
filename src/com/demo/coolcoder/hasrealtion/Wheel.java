package com.demo.coolcoder.hasrealtion;

public class Wheel {
	
	private String weelName;
	
	private String wheelType;

	public String getWeelName() {
		return weelName;
	}

	public void setWeelName(String weelName) {
		this.weelName = weelName;
	}

	@Override
	public String toString() {
		return "Wheel [weelName=" + weelName + ", wheelType=" + wheelType + "]";
	}

	public String getWheelType() {
		return wheelType;
	}

	public void setWheelType(String wheelType) {
		this.wheelType = wheelType;
	}

}
