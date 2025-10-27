package com.demo.coolcoder.oops.abstraction.client;

import com.demo.coolcoder.oops.abstraction.BankService;
import com.demo.coolcoder.oops.abstraction.HDFCBankService;
import com.demo.coolcoder.oops.abstraction.InterestDetailDto;

public class AbstractTest {
	
	public static void main(String[] args) {
		InterestDetailDto interestDetailDto = new InterestDetailDto(100000d, 12, 9);
		
		BankService bankService = new HDFCBankService(interestDetailDto);
		
		double calculateInterest = bankService.calculateInterest(interestDetailDto.getPriniciple(),interestDetailDto.getMonths(),interestDetailDto.getRate());
		
		System.out.println(calculateInterest);
		
	}

}
