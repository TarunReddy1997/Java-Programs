package com.ojas.app;

public class Pattern9 {
	public static void main(String[] args) {
		String res="";
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=rows;cols++)
			{
				res+="*";
			}
			res+="\n";
		}
		System.out.println(res);
	}
}
