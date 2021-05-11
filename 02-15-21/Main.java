package com.ojas.app;

import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter student ID");
		int sid = scanner.nextInt();
		
		System.out.println("Enter name");  
		String name = scanner.next();
		
		System.out.println("enter the examFee");
		double fee = scanner.nextDouble();
		
		DayScholar dayScholar=new DayScholar(sid, name, fee);
		System.out.println(dayScholar.payfee(200));
		System.out.println(dayScholar.toString());
	}
}
