package or.js.app;

import java.util.Scanner;

public class Armstrong
{
	public static void main(String[] args)
	{
		int number;
		int remainder;
		int sum=0;
		int temp=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to find armstrong or not");
		number=scanner.nextInt();
		
		temp=number;
		while(number>0)
		{
			remainder=number%10;
			number=number/10;
			sum=sum+(remainder*remainder*remainder);
		}
		
		//System.out.println(sum);
		
		if(temp==sum)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
	}
}
