package com.oj.app;

public class Fizz_Array
{
	public static int[] fizzyArray(int start, int end)
	{
		int[] newArray= new int[end-start];
		for (int i = 0; i < newArray.length; i++) 
		{
			
			newArray[i] = start++;
		}
		return newArray;
		
	}
	public static void main(String[] args) 
	{
		int start = 5;
		int end = 10;
		int[] newArray = fizzyArray(start,end);
		System.out.print("Elements are [");
		for (int i = 0; i < newArray.length; i++) 
		{
			if( i < newArray.length-1)
				System.out.print(newArray[i] + ",");
			else
				System.out.print(newArray[i]);
		}
		System.out.println("]");
	}
}
