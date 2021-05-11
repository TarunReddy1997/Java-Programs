package or.js.app;

import java.util.Scanner;

public class Occurance
{
	public static void main(String[] args)
	{
		
			System.out.println("Enter the size of the array");
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int[] inputArray = new int[size];
			System.out.println("Enter the elements");
			for (int i = 0; i < inputArray.length; i++) {
				inputArray[i] = sc.nextInt();
			}
			System.out.println("Enter the number to find the occurance");
			int givenNumber = sc.nextInt();

			System.out.println(getCount(inputArray, givenNumber));
			sc.close();
		}

		private static int getCount(int[] inputArray, int givenNumber)
		{
			int occurance = 0;
			for (int i = 0; i < inputArray.length; i++) {
				if (inputArray[i] == givenNumber) {
					occurance++;
				}
			}
			return occurance;
		
	}
}
