package com.demo.coolcoder.hasrealtion;

public class Address {
	


	@Override
	public String toString() {
		return "Address [addId=" + addId + ", address=" + address + ", adddType=" + adddType + "]";
	}

	private int addId;
	
	private String address;
	
	private String adddType;
	
	
	public int getAddId() {
		return addId;
	}

	public void setAddId(int addId) {
		this.addId = addId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdddType() {
		return adddType;
	}

	public void setAdddType(String adddType) {
		this.adddType = adddType;
	}

}
