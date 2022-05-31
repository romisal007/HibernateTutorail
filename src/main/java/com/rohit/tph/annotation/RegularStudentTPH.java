package com.rohit.tph.annotation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("regularStudent")
public class RegularStudentTPH extends StudentTPH {
	@Column(name = "fees")
	private float fees;
	
	@Column(name = "department")
	private String department;

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	

}
