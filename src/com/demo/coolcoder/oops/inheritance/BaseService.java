package com.demo.coolcoder.oops.inheritance;

public class BaseService {

	private int baseId;
	
	private String baseName;
	
	public BaseService(int baseId,String baseName) {
		this.baseId = baseId;
		this.baseName =baseName; 
	}
	
	
	public int getBaseId() {
		return baseId;
	}

	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}

	public String getBaseName() {
		return baseName;
	}

	public void setBaseName(String baseName) {
		this.baseName = baseName;
	}

}
