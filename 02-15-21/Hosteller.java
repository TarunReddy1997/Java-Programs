package com.ojas.app;

public class Hosteller extends Student
{
	double hostelFee;
	
	public Hosteller(int studentId,String name,double examFee)
	{
		super(studentId,name,examFee);
		this.hostelFee = hostelFee;
	}
	
	public double fee(int amount)
	{
		return hostelFee = hostelFee-amount;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	

	
}
