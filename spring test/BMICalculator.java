package com;

public class BMICalculator {
private Patient patient;

public Patient getPatient() {
	return patient;
}

public void setPatient(Patient patient) {
	this.patient = patient;
}

public double BMI()
{
	return (patient.getPatientWeight()/patient.getPatientHeight()*patient.getPatientHeight())*703;
}


	


}