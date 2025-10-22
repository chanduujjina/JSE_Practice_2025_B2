package com.demo.coolcoder.oops;

public class Sample {
	
	
 // instance variable -> 1
	private int sampleId;//0,1
	
	private String sampleName;//null,Hemoglobin
	
	private String sampleType;//null,blood
	
	public Sample() {
		
	}
	
	public Sample(int id,String name,String  type) {//constrctor 2
		this(id);//Constrctor call
		this.sampleName =name;
		this.sampleType =type; 
	}
	
	public Sample(String name,String  type) {//constrctor 2
		this.sampleName =name;
		this.sampleType =type; 
	}
	
	private Sample(int sampleId) {
		this.sampleId = sampleId;
	}
	
	
	public void setSampleId(int sampleId) {
		this.sampleId = sampleId;
	}
	
	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}
	
	public void setSampleType(String sampleType) {
		this.sampleType = sampleType;
	}
	
	
	public int getSampleId() {
		return this.sampleId;
	}
	
	public String getSampleName() {
		return this.sampleName;
	}
	
	public String getSampleType() {
		return this.sampleType;
	}
	
	
	@Override
	public String toString() {
		return "Sample [sampleId=" + sampleId + ", sampleName=" + sampleName + ", sampleType=" + sampleType + "]";
	}
	
	

}
