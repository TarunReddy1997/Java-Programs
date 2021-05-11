package com.ojas.app;

public class Pattern7 {
	public static void main(String[] args) {
		int a=65;
		String res="";
		for(int rows=1;rows<=5;rows++)
		{
			for(int cols=1;cols<=rows;cols++)
			{
				char ch=(char) a;
				res+=ch+" ";
				a++;
			}
			res+=" \n";
		}
		System.out.println(res);
		
	}
}
