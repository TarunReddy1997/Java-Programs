package com.oj.app;


public class Remove10 
{
	public static void main(String[] args) 
	{
		
		int[] arr = {1, 3, 10, 18, 10};
		int[] arr1 = withoutTen(arr);
		System.out.print("Elements are [");
		for (int i = 0; i < arr.length; i++) 
		{
			if( i < arr1.length-1)
				System.out.print(arr1[i] + ",");
			else
				System.out.print(arr1[i]);
		}
		System.out.println("]");
	}

	private static int[] withoutTen(int[] arr) 
	{
		int pos = 0;
		int[] newArrray= new int[arr.length];
		for (int i = 0; i < arr.length; i++)
		{
			if(arr[i] != 10)
			{
				newArrray[pos] = arr[i];
				pos++;
			}
		}
		return newArrray;
	}

}
