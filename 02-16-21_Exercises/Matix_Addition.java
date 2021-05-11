package com.ojas.app;

import java.util.Scanner;

public class Matix_Addition
{
	public static void main(String[] args) 
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the no of rows for first matrix");
		int rows1=scanner.nextInt();
		
		System.out.println("enter the no of columns for first matrix");
		int columns1=scanner.nextInt();
		
		System.out.println("enter the no of rows for second matrix");
		int rows2=scanner.nextInt();
		
		System.out.println("enter the no of columns for second matrix");
		int columns2=scanner.nextInt();
		
		
		int firstmatrix[][]=new int[rows1][columns1];
		int secondmatrix[][]=new int[rows2][columns2];
		int result[][]=new int[rows1][columns1];
		
		
		if(rows1 == columns1 && rows2 == columns2)
		{
			System.out.println("enter the values into first matrix");
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns1;j++)
				{
					firstmatrix[i][j]=scanner.nextInt();
				}
			}
			
			System.out.println("enter the values into second matrix");
			for(int i=0;i<rows2;i++)
			{
				for(int j=0;j<columns2;j++)
				{
					secondmatrix[i][j]=scanner.nextInt();
				}
			}
			
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<columns2;j++)
				{
					result[i][j]=firstmatrix[i][j]+secondmatrix[i][j];
					System.out.print(result[i][j]+" ");
				}
				System.out.println();
			}
		}
		else
		{
			System.out.println("matrix addition is not possible");
		}
		
	}
}
