package com.demo.coolcoder;

public class InternEmployee extends BaseEmployee{
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getInternShipStartDate() {
		return internShipStartDate;
	}
	public void setInternShipStartDate(String internShipStartDate) {
		this.internShipStartDate = internShipStartDate;
	}
	public String getInternShipEndDate() {
		return internShipEndDate;
	}
	public void setInternShipEndDate(String internShipEndDate) {
		this.internShipEndDate = internShipEndDate;
	}
	private String collegeName;
	private String internShipStartDate;
	private String internShipEndDate;

}
