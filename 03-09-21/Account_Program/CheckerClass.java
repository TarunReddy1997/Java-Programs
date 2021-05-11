
public class CheckerClass {
	
	public static void main(String[] args) {
		
		Customer c = new Customer("Hotur","prasad");		
		
		Account a = new Account();
		a.accountNo = 1233;
		a.interestRate = 5.5f;
		a.deposite(5000);
		a.withDraw(2000);
		System.out.println(c);
		System.out.println(a);
		
		
	
		
	}

}
