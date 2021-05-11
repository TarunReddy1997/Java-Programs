package or.ojas.app;
import java.util.Scanner;
public class Pattern8 {
	static String isPattern8(int num) {
		String res = "";
		for(int rows = 1; rows<=num;rows++) {
			int k=rows;
			for(int columns = 1; columns<=rows;columns++) {
				res+=k+" ";
				k++;
			}
			res+="\n";
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		System.out.println(isPattern8(scan.nextInt()));


	}

}

