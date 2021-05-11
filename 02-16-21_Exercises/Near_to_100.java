package com.ojas.app;

import java.util.Scanner;

public class Near_to_100
{
	public static boolean nearHundred(int number)
	{
		if(number < 0)
			return false;
		if((100 - 10) >= number && number <= 110 ||  (200 -10) >= number && number <= 210)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you have to check near 100 or 200: ");
		int givenNumber = scanner.nextInt();
		System.out.println(nearHundred((givenNumber)));
		scanner.close();
	}
}
