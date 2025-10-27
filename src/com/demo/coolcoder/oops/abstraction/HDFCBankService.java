package com.demo.coolcoder.oops.abstraction;

public class HDFCBankService extends BankService{
	
	private InterestDetailDto interestDetailDto;

	public HDFCBankService(InterestDetailDto interestDetailDto) {
		this.interestDetailDto = interestDetailDto;
	}

	public InterestDetailDto getInterestDetailDto() {
		return interestDetailDto;
	}

	@Override
	public double calculateInterest(double priniciple, int months, int rate) {

		return (priniciple * months * rate) / 100;
	}

}
