package com.ojas.app;

public class Pattern1 {
	public static void main(String[] args) {
		int rows,cols;
		String res="";
		for(rows=5;rows>=1;rows--)
		{
			for(cols=5;cols>=1;cols--)
			{
				res+=cols+"";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
