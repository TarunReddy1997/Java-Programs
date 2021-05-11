package strings;

import java.util.Scanner;

public class LuckySum {
	static int luckySum(int num1,int num2,int num3) {
		int sum = 0;
		if(num1 <= 9)
			sum += num1;
		else
			return sum;
		
		if(num2 <= 9)
			sum += num2;
		else
			return sum;
		
		if(num3 <= 9)
			sum += num3;
		else
			return sum;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the three number");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		System.out.println(luckySum(num1,num2,num3));
	}

}
