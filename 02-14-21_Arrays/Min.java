package or.js.app;

import java.util.Scanner;

public class Min 
{
	public static void main(String[] args)
	{
		int size;
		int temp=0;
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		size=scanner.nextInt();
		
		System.out.println("enter the elements into array");
		int arr[]=new int[size];
		
		for(i=0;i<size;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("array in sorted order");
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("smallest is: "+arr[0]);
		
	}
}
