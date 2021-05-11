
public class Account {
	double balance = 0;
	int accountNo;
	float interestRate;
	public void deposite(double amount) {
		balance = this.balance + amount;
		
	}
	public void withDraw(double amount) {
		balance = this.balance - amount;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + ", accountNo=" + accountNo + ", interestRate=" + interestRate + "]";
	}
	
	
}
