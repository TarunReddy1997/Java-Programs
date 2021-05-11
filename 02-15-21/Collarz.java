package com.ojas.app;

import java.util.Scanner;

public class Collarz 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		//int number=scanner.nextInt();
		Collarz.getCollarz(scanner.nextInt());
		
		
	}
	static void getCollarz(int number)
	{
		while(number != 1)
		{
			System.out.println(number +" ");
			
			if ((number & 1) == 1)
			{
              number = 3 * number + 1;
			}
			else
			{
				number = number/2;
			}
		}
		System.out.println(number);
	}
}
