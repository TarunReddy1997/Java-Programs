package com.ojas.app;

public class DayScholar extends Student
{
	double transportFee;
	
	public DayScholar(int studentId, String name, double examFee)
	{
		super(studentId, name, examFee);
		this.transportFee = transportFee;
	}
	
	public double payfee(int amount)
	{
		return transportFee = transportFee+amount;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + "]";
	}
	
	
}
