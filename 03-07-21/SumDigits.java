package strings;

import java.util.Scanner;

public class SumDigits {
	static int sumDigit(String str) {
		int sum = 0;
		for(int i =0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String str = sc.next();
		System.out.println(sumDigit(str));

	}

}
