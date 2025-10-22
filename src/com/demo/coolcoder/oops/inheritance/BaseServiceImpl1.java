package com.demo.coolcoder.oops.inheritance;

public class BaseServiceImpl1 extends BaseService{

	
	private int id;
	
	private String name;
	
	public BaseServiceImpl1(int id,String name,int baseId,String baseName) {
		super(baseId,baseName);// it will invoke parent class constrctor
		this.id = id;
		this.name = name;
		
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	

}
