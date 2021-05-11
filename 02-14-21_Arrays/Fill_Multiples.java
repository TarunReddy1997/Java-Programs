package or.js.app;

import java.util.Scanner;

public class Fill_Multiples 
{
	public static void main(String[] args)
	{
		int size;
		int mul=10;
		int i,j;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the size of array");
		size= scanner.nextInt();
		
		System.out.println("enter the number to print multiples");
		int n=scanner.nextInt();
		
		//System.out.println("enter the elements into array");
		int arr[]=new int[size];
		
		System.out.println(n+" multiples till 10 are");
		for(i=0;i<size;i++)
		{
			for(j=1;j<=mul;j++)
			{
				arr[i]=n*j;
			
				System.out.println(arr[i]);
			}
			
		}
		
		//System.out.println(arr[i]);
//		for(int k=0;k<size;k++)
//		{
//			System.out.println(arr[i]);
//		}
		
	}
}
