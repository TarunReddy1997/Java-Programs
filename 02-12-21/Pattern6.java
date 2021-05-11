package or.ojas.app;

import java.util.Scanner;

public class Pattern6 
{
	public static void main(String[] args) 
	{
		int number=0;
		int n;
		int count=1;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(int rows = 1;rows <= n;rows++)
		{
			number++;

			for(int columns = 1;columns <= number;columns++)
			{
				System.out.print(count++ +" ");
			}
			System.out.println(" ");
		}
	}
}
