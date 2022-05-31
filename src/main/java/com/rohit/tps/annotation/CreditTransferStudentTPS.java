package com.rohit.tps.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "credittransferStudent104")
@PrimaryKeyJoinColumn(name = "ID")
public class CreditTransferStudentTPS extends StudentTPS {

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
