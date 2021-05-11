package or.ojas.app;

import java.util.Scanner;

public class Pattern12 
{
	public static void main(String[] args) 
	{
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(int rows = 1;rows <= n;rows++)
		{
			for(int columns = 1;columns <= n;columns++)
			{
				if((rows==1 || columns==1) || (rows==5 || columns==5))
				System.out.print("*"+" ");
				else
				System.out.print(" "+" ");
			}
			System.out.println(" ");
		}
	}
}
