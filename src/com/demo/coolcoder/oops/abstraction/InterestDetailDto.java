package com.demo.coolcoder.oops.abstraction;

public class InterestDetailDto {
	
	public InterestDetailDto(double priniciple, int months, int rate) {
		super();
		this.priniciple = priniciple;
		this.months = months;
		this.rate = rate;
	}
	public double getPriniciple() {
		return priniciple;
	}
	public void setPriniciple(double priniciple) {
		this.priniciple = priniciple;
	}
	public int getMonths() {
		return months;
	}
	public void setMonths(int months) {
		this.months = months;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	private double priniciple;
	private int months;
	private int rate;

}
