package strings;

import java.util.Scanner;

public class DifferenceOf21 {
	static void difference21(int num) {
		int num1 = 21;
		int res = num1 - num;
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get differnce");
		int num = sc.nextInt();
		difference21(num);
	}

}
