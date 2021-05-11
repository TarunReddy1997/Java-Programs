package com.ojas.app;

public class Pattern18 {
	public static void main(String[] args) {
		String res="";
		for(int rows = 1;rows <= 5;rows ++)
		{
			for(int cols = 1;cols <= 5;cols ++)
			{
				if(cols %2 != 0)
				{
					res+="1"+" ";
				}
				else
				{
					res+="*"+" ";
				}
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
