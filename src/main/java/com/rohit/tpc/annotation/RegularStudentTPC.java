package com.rohit.tpc.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "regStudent103")
@AttributeOverrides({
	
	@AttributeOverride(name = "id",column = @Column(name="id")),
	@AttributeOverride(name = "name",column = @Column(name="name"))
})
public class RegularStudentTPC extends StudentTPC {
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
