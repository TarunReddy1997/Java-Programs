package com.ojas.app;

import java.util.Scanner;

public class Pattern10 {
	public static void main(String[] args) {
		int stars=0;
		int space=6;
		String res="";
		for(int rows = 1;rows <= 5;rows++)
		{
			stars++;
			space--;
			
			for(int rows1 = 1;rows1 <= space;rows1++)
			{
				res+=" ";
			}
			
			for(int columns = 1;columns <= stars;columns++)
			{
				res+="*"+" ";
			}
			res+="\n";
		}
		System.out.println(res);
	}
}
