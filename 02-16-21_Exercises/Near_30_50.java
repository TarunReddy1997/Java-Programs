package com.ojas.app;

import java.util.Scanner;

public class Near_30_50 
{
	public static boolean compare(int number1, int number2)
	{
		if(30 <= number1 && number1 <= 40 && 30 <= number2 && number2 <= 40 || 40 <= number1 && number1 <= 50 && 40 <= number2 && number2 <= 50)
		{
			return true; 
		}
		else if(number1 < 0 || number2 < 0)
		{
			return false;
		}
		else
		{
			return false;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two values to check");
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		System.out.println(compare(number1, number2));
		scanner.close();
		
	}
}
