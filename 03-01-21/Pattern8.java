package com.ojas.app;

public class Pattern8 {
	public static void main(String[] args) {
		String res="";
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=5;cols++)
			{
				res+="*";
			}
			res+="\n";
		}
		System.out.println(res);
	}
}
