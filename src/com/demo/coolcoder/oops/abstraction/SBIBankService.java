package com.demo.coolcoder.oops.abstraction;

public class SBIBankService extends BankService {

	private InterestDetailDto interestDetailDto;

	public SBIBankService(InterestDetailDto interestDetailDto) {
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
