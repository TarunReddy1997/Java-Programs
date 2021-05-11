package com.ojas.app;

public class Pattern12 {
	public static void main(String[] args) {
		String res="";
		int count=2;
		for(int rows=1;rows<=5;rows++) 
		{
			for(int cols=1;cols<=rows;cols++) 
			{
				res+=count++ +" ";
				count++;
			}
			res+=" \n";
		}
		System.out.println(res);
	}
}
