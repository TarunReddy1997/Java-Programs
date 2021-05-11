package or.ojas.app;

import java.util.Scanner;

public class Pattern1 
{
	public static void main(String[] args) 
	{
		int rows,columns;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		for(rows = 1;rows <= n;rows++)
		{
			for(columns = 1;columns <= n;columns++)
			{
				System.out.print(columns+" ");
			}
			System.out.println();
		}
	}
}
