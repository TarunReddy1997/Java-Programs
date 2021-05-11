package com.ojas.app;

import java.util.Scanner;

public class Absolute 
{
	public static void main(String[] args)
	{
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to substract");
		num=sub(scanner.nextInt());
		System.out.println(num);

	}

	public static int sub(int num)
	{
		if(num>0)
		{
			return num-21;
		}
		else
		{
			return num-(-21);
		}


	}
}
