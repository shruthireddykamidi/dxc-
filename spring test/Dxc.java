package com.example.demo;
import org.springframework.stereotype.Component;

@Component
public class Dxc {
	private int EmployeeId;
 private String Employmentype;
 private int year;
 private Cohorts Cohorts;
public void getEmployeeId() {
	System.out.println("employee id is..>"+EmployeeId);
}
public void setEmployeeId(int employeeId) {
	EmployeeId = employeeId;
}
public void getEmploymentype() {
	System.out.println("employment type is..>"+Employmentype);
}
public void setEmploymentype(String employmentype) {
	Employmentype = employmentype;
}
public void getYear() {
	System.out.println("employee year is..>"+year);
}
public void setYear(int year) {
	this.year = year;
}
public Cohorts getCohorts() {
	return Cohorts;
}
public void setCohorts(Cohorts cohorts) {
	Cohorts = cohorts;
}
}
