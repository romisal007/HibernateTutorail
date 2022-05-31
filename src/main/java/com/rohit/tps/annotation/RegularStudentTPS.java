package com.rohit.tps.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "regStudent104")
@PrimaryKeyJoinColumn(name = "ID")
public class RegularStudentTPS extends StudentTPS {
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
