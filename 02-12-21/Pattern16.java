package or.ojas.app;
import java.util.Scanner;
public class Pattern16 {
	static String isPattern16(int num) {
		String res = "";int c=1;
		for(int rows=1;rows<=num;rows++) {
			c=rows*(rows+1)/2;
			for(int columns=num;columns>=rows;columns--) {
				res+=" ";
			}
			for(int columns = 1;columns<=rows;columns++) {
				res+= c-columns+1;
			}
			
			res+="\n";
		}

		return res;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number : ");
		System.out.println(isPattern16(scan.nextInt()));
	}
}

