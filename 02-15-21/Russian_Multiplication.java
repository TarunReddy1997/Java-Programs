package com.ojas.app;

import java.util.Scanner;

public class Russian_Multiplication
{
	public static void main(String[] args) 
	{
		int mul = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		System.out.println("Enter second number:");
		int num2 = sc.nextInt();

		if(num2 % 2 == 0) 
		{
			mul = (num1 * num2) * (num2 / 2);
		}
		else
		{
			mul = ((num1 * 2) * (num2 / 2) + num1);
		}
		System.out.println(mul);
		sc.close();

	}
}
