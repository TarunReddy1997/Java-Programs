package com.ojas.app;

public class Pattern14 {
	public static void main(String[] args) {
		String res="";
		for(int rows=1;rows<=4;rows++)
		{
			for(int cols=1;cols<=4;cols++)
			{
				if(rows % 2==0)
				{
					res+="0"+" ";
				}
				else
				{
					res+="1"+" ";
				}
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
