package com.ojas.app;

import java.util.Scanner;

public class Matix_Multiplication 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter the no of rows for first matrix");
		int rows1 = scanner.nextInt();
		
		System.out.println("enter the no of columns for first matrix");
		int columns1 = scanner.nextInt();
		
		System.out.println("enter the no of rows for second matrix");
		int rows2 = scanner.nextInt();
		
		System.out.println("enter the no of columns for second matrix");
		int columns2 = scanner.nextInt();
		
		if(rows1 == columns2)
		{
			int first_matrix[][] = new int[rows1][columns1];
			
			int second_matrix[][] = new int[rows2][columns2];
			int result[][]=new int[rows1][columns2];
			
			System.out.println("enter the numbers into first matrix");
			for(int i = 0;i < rows1; i++)
			{
				for(int j = 0;j < columns1; j++)
				{
					first_matrix[i][j] = scanner.nextInt();
				}
			}
			
			System.out.println("enter the number into second matrix");
			for(int i = 0;i < rows2; i++)
			{
				for(int j = 0; j < columns2; j++)
				{
					second_matrix[i][j] = scanner.nextInt();
				}
			}
			
				for(int i = 0; i < rows1; i++)
				{
					for(int j = 0; j < columns2; j++)
					{
						for(int k=0;k<columns2;k++)
						{
							result[i][j] = result[i][j] + (first_matrix[i][k] * second_matrix[k][j]);
						}
						System.out.print(result[i][j]+" ");
					}
					System.out.println(" ");
				}
		}
		else 
		{
			System.out.println("matix multiplication is not possible");
		}
			
		
	}
}
