package com.ojas.app;

public class Pattern6 {
	public static void main(String[] args) {
		String res="";
		int count=1;
		for(int rows=5;rows>=1;rows--)
		{
			for(int cols=1;cols<=rows;cols++)
			{
				res+=count+"";
			}
			count++;
			res+=" \n";
		}
		System.out.println(res);
	}
}
