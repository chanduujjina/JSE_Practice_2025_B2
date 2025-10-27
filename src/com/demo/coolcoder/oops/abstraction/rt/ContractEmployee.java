package com.demo.coolcoder.oops.abstraction.rt;

public class ContractEmployee extends BaseEmployee{
	
	public String getPayRollCompany() {
		return payRollCompany;
	}

	public void setPayRollCompany(String payRollCompany) {
		this.payRollCompany = payRollCompany;
	}

	public String getContractStartDate() {
		return contractStartDate;
	}

	public void setContractStartDate(String contractStartDate) {
		this.contractStartDate = contractStartDate;
	}

	public String getContractEndDate() {
		return contractEndDate;
	}

	public void setContractEndDate(String contractEndDate) {
		this.contractEndDate = contractEndDate;
	}

	private String payRollCompany;
	
	private String contractStartDate;
	
	private String contractEndDate;
	
	

}
