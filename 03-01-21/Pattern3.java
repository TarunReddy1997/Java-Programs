package com.ojas.app;

public class Pattern3 {
	public static void main(String[] args) {
		int rows,cols;
		String res="";
		for(rows=5;rows>=1;rows--)
		{
			for(cols=5;cols>=1;cols--)
			{
				res+=rows+" ";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
