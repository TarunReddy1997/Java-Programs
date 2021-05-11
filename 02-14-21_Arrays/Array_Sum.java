package or.js.app;

import java.util.Scanner;

public class Array_Sum
{
	public static void main(String[] args)
	{
		int size;
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size");
		size=scanner.nextInt();
		
		System.out.println("enter the elements into array");
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("sum of elements in an array is:");
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.print(sum);
	}
}
