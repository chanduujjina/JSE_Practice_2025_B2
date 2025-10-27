package com.demo.coolcoder.oops.abstraction.rt;

public class PermemnentEmployee extends BaseEmployee{
	
	private String doj;
	
	private String salaryAccount;
	
	private String aadharNo;

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public String getSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(String salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

}
