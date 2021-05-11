package com.ojas.app;

public class Pattern15 {
	public static void main(String[] args) {
		String res="";
		int count=16;
		for(int rows=1;rows<=4;rows++)
		{
			for(int cols=1;cols<=4;cols++)
			{
				res+=count-- +" ";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
