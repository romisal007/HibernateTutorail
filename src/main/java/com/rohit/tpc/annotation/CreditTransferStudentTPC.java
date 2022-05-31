package com.rohit.tpc.annotation;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "creditTfStud")
//here we are not giving table name hibernate will create table on name of classname credittransferstudent
@AttributeOverrides({
	@AttributeOverride(name = "id",column = @Column(name="id")),
	@AttributeOverride(name = "name",column = @Column(name="name"))
})
public class CreditTransferStudentTPC extends StudentTPC {

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
