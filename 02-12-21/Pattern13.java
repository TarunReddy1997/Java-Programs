package or.ojas.app;

import java.util.Scanner;

public class Pattern13 
{
	public static void main(String[] args) 
	{
		int stars=-1;
		int space=8;
		int n;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(int rows = 1;rows <= n;rows++)
		{
			stars+=2;
			space-=2;
			
			for(int rows = 1;rows <= space;rows++)
			{
				System.out.print(" ");
			}
			
			for(int columns = 1;columns <= stars;columns++)
			{
				System.out.print("*"+" ");
			}
			
			
			
			System.out.println();
		}
	}
}
