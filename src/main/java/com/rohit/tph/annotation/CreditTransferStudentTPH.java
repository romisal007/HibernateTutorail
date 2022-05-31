package com.rohit.tph.annotation;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("credidTransferStudent")
public class CreditTransferStudentTPH extends StudentTPH {

	@Column(name = "duration")
	private String duration;
	
	@Column(name = "noOfCredit")
	private int noOfCredit;

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getNoOfCredit() {
		return noOfCredit;
	}

	public void setNoOfCredit(int noOfCredit) {
		this.noOfCredit = noOfCredit;
	}
	
}
