package or.ojas.app;

import java.util.Scanner;

public class Pattern7 
{
	public static void main(String[] args) 
	{
		int number=0;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(int rows = n;rows >= 1;rows--)
		{
			number++;

			for(int columns = 1;columns <= number;columns++)
			{
				System.out.print(rows+" ");
			}
			System.out.println(" ");
		}
	}
}
