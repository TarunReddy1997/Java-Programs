package or.ojas.app;

import java.util.Scanner;


public class Pattern14 
{
	public static void main(String[] args) 
	{
		int n;
		int start;
		int end;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number to multiply with");
		n=scanner.nextInt();
		
		System.out.println("enter the range from where to start");
		start=scanner.nextInt();
		
		System.out.println("enter the range where to end");
		end=scanner.nextInt();
		
		
		for(int i = start;i <= end;i++)
		{
			System.out.println(n+""+"*"+i+" = "+i*n);
		}
	}
}
