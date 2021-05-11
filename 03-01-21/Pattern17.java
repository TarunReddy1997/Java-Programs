package com.ojas.app;

public class Pattern17 {
	public static void main(String[] args) {
		String res="";
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=5;cols++)
			{
				if(rows==1 || rows==5 || cols==1 || cols==5)
				{
					res+="1"+" ";
				}
				else
				{
					res+=" "+" ";
				}
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
