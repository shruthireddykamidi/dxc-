package com.example.demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Internship {
 public static void main(String[] args) {
	 ApplicationContext con=new ClassPathXmlApplicationContext("bean.xml");
	 Cohorts cs=(Cohorts) con.getBean("cc");
	 cs.getCohortId();
	 cs.getCohortName();
	 cs.getEmailId();
	 cs.getContactNo();
	 
	 
	 
	 Dxc d=(Dxc) con.getBean("dd");
	 d.getEmployeeId();
	 d.getEmploymentype();
	 d.getYear();
	 
			 
 }
}