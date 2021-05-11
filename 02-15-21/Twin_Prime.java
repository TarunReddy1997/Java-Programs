package or.js.app;

import java.util.Scanner;

public class Twin_Prime
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		for(int i=2;i<number;i++)
		{
			if(isPrime(i) && isPrime(i+2))
			{
				//System.out.print("("+i +","+ i+2 +")");
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
	}
	
	public static boolean isPrime(int number)
	{
		if(number<2)
		
			return false;
		
		for(int i=2;i<=number/2;i++)
		{
			if(number%i==0)
			
				return false;
			
		}
		return true;
	}
}

