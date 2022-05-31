package com.rohit.tpc.usingxml;

public class ContractEmployeeTPC extends EmployeeTPC  {

	private float payPerHour;
	private String contractDuration;
	public float getPayPerHour() {
		return payPerHour;
	}
	public void setPayPerHour(float payPerHour) {
		this.payPerHour = payPerHour;
	}
	public String getContractDuration() {
		return contractDuration;
	}
	public void setContractDuration(String contractDuration) {
		this.contractDuration = contractDuration;
	}
	
}
