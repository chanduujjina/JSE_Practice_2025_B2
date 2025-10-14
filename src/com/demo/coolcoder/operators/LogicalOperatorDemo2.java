package com.demo.coolcoder.operators;

import java.time.LocalDate;

public class LogicalOperatorDemo2 {
	
	public static void main(String[] args) {
		
		LocalDate startDate = LocalDate.now();
		
		LocalDate endDate = LocalDate.now().plusMonths(1);
		
		
		System.out.println("start Date:"+startDate);
		
		
		System.out.println("end Date:"+endDate);
		
		//input date\
		
		LocalDate inputDate = LocalDate.now().plusDays(10);
		
		
		System.out.println("inputDate:"+inputDate);
		
		//boolean result = inputDate.isBefore(endDate) && inputDate.isAfter(startDate);
		
		if (inputDate.isBefore(endDate) && inputDate.isAfter(startDate)) {
			System.out.println("inside if ");
		}
		else {
			System.out.println("inside else ");
		}
		
		//System.out.println(result);
		
	}

}
