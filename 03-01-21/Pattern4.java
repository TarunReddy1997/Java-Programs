package com.ojas.app;

public class Pattern4 {
	public static void main(String[] args) 
	{
		String res="";
		for(int rows=5;rows>=1;rows--) 
		{
			for(int cols=5;cols>=rows;cols--) 
			{
				res+=rows+"";
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
