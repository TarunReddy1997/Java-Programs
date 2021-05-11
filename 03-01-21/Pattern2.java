package com.ojas.app;

public class Pattern2 {
	public static void main(String[] args) {
		int rows,cols;
		String res="";
		for(rows=1;rows<=5;rows++)
		{
			for(cols=1;cols<=5;cols++)
			{
				res+=rows+"";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
