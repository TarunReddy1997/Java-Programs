package or.js.app;

import java.util.Scanner;

public class Count_Evens 
{
	public static void main(String[] args) 
	{
		int size;
		int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		size=scanner.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the elements into array");
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(int i=0;i<size;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("count of even numbers in an array is:"+count);
	}
}
