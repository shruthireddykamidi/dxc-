package com;

public class Patient {
private int patientId;
private double patientWeight;
private double patientHeight;
private String name;
BMICalculator b;
public int getPatientId() {
	return patientId;
}
public void setPatientId(int patientId) {
	this.patientId = patientId;
}
public double getPatientWeight() {
	return patientWeight;
}
public void setPatientWeight(double patientWeight) {
	this.patientWeight = patientWeight;
}
public double getPatientHeight() {
	return patientHeight;
}
public void setPatientHeight(double patientHeight) {
	this.patientHeight = patientHeight;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public void show() {
	System.out.println(b.BMI());;
}
}