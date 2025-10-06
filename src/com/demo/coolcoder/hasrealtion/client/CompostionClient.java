package com.demo.coolcoder.hasrealtion.client;

import com.demo.coolcoder.hasrealtion.Heart;
import com.demo.coolcoder.hasrealtion.Human;

public class CompostionClient {
	public static void main(String[] args) {
		Human human = new Human("test Human","test heart");
		
		Heart heart = human.getHeart();
		
		System.out.println(heart.getType());
		
		System.out.println("name:"+human.getName());
		
		
	}

}
