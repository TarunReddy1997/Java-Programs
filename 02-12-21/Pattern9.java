package or.ojas.app;

import java.util.Scanner;

public class Pattern9
{
	public static void main(String abc[])
	{
		int alphabet=65;                        
		for(int i=1;i<6;i++)
		{            
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)alphabet +" ");
				alphabet++;
			}
			System.out.println();
		}
	}
}
