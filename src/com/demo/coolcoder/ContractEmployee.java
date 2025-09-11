package com.demo.coolcoder;

public class ContractEmployee extends BaseEmployee {
	

	private String contractStartDate;

	private String contractEndDate;

	private String payRollCompany;
	
	
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

	public String getPayRollCompany() {
		return payRollCompany;
	}

	public void setPayRollCompany(String payRollCompany) {
		this.payRollCompany = payRollCompany;
	}

}
