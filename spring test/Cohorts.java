package com.example.demo;
public class Cohorts {
	public Cohorts() {
		super();
		System.out.println("Inside cohort class");
		// TODO Auto-generated constructor stub
	}
	private int CohortId;
	private String CohortName;
	private String emailId;
	private long contactNo;
	
	public void getCohortId() {
		System.out.println("cohort id is...>"+CohortId);
	}
	public void setCohortId(int cohortId) {
		CohortId = cohortId;
	}
	public void getCohortName() {
		System.out.println("cohort name is...>"+CohortName);
	}
	public void setCohortName(String cohortName) {
		CohortName = cohortName;
	}
	public void getEmailId() {
		System.out.println("cohort mail id is...>"+emailId);
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public void getContactNo() {
		System.out.println("cohort number is...>"+contactNo);
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	
}
