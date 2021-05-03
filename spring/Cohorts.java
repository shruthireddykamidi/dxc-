package com;

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
	
	public int getCohortId() {
		return CohortId;
	}
	public void setCohortId(int cohortId) {
		CohortId = cohortId;
	}
	public String getCohortName() {
		return CohortName;
	}
	public void setCohortName(String cohortName) {
		CohortName = cohortName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}


	
}