package com.demo.coolcoder.oops.abstraction.rt;

public class InternEmlpoyee extends BaseEmployee {
	
	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getYearOfPassedOut() {
		return yearOfPassedOut;
	}

	public void setYearOfPassedOut(String yearOfPassedOut) {
		this.yearOfPassedOut = yearOfPassedOut;
	}

	public String getQulifacation() {
		return Qulifacation;
	}

	public void setQulifacation(String qulifacation) {
		Qulifacation = qulifacation;
	}

	public String getUniveristy() {
		return Univeristy;
	}

	public void setUniveristy(String univeristy) {
		Univeristy = univeristy;
	}

	public String getInternshipStartDate() {
		return internshipStartDate;
	}

	public void setInternshipStartDate(String internshipStartDate) {
		this.internshipStartDate = internshipStartDate;
	}

	public String getInternshipEndDate() {
		return internshipEndDate;
	}

	public void setInternshipEndDate(String internshipEndDate) {
		this.internshipEndDate = internshipEndDate;
	}

	private String collegeName;
	
	private String yearOfPassedOut;
	
	private String Qulifacation;
	
	private String Univeristy;
	
	private String internshipStartDate;
	
	private String internshipEndDate;

}
