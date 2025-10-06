package com.demo.coolcoder.hasrealtion;

public class Human {
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	
	private Heart heart;
	
	public Heart getHeart() {
		return heart;
	}

	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public Human(String name,String type) {
		 this.heart = new Heart(type);
		 this.name = name;
	}

}
