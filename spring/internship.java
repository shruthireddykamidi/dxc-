package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.AppConfig;

public class Internship {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	Set set = context.getBean(Set.class);
	ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
	Cohorts c = (Cohorts)app.getBean("cohorts");
	
}
}
