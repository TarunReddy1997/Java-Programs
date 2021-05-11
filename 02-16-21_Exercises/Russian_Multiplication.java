package com.ojas.app;

import java.util.Scanner;

public class Russian_Multiplication 
{
	public static void main(String[] args) 
	{
		int n1,n2;
		int result=0;
		int result1=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter num1");
		n1=scanner.nextInt();
		System.out.println("enter num2");
		n2=scanner.nextInt();
		
		if(n1 != 1)
		{
			result=(n1/2)*(n2*2);
		}
		System.out.println(result);
		

	}
}
