package com.ojas.app;

import java.util.Scanner;

public class Near_10 
{
	public static int near10(int number1, int number2)
	{
		if(Math.abs(number1 - 10) == Math.abs(number2 - 10))
		{
			return 0;
		}
		else if(Math.abs(number1 - 10) < Math.abs(number2) - 10 )
		{
			return number1;
		}
		else
		{
			return number2;
		}
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		int number1 = scanner.nextInt();
		System.out.println("Enter number 2: ");
		int number2 = scanner.nextInt();
		System.out.println(near10(number1, number2));
		scanner.close();
		
	}
}
