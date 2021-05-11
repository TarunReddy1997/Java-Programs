package com.ojas.app;

import java.util.Scanner;

public class Last_Digit_Equal 
{
	public static boolean lastDigitEqual(int number1, int number2)
	{
		if((number1 % 10) == (number2 % 10))
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
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		System.out.println(lastDigitEqual(number1, number2));
		scanner.close();
		
	}
}
