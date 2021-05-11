package com.ojas.app;

public class Pattern13 {
	public static void main(String[] args) {
		String res="";
		for(int rows=0;rows<=4;rows++)
		{
			for(int cols=0;cols<=rows;cols++)
			{
				res+=cols+" ";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
