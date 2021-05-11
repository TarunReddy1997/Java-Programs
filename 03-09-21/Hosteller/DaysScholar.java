
public class DaysScholar extends Student 
{
	double TransportFee;
	public DaysScholar() 
	{
		double TransportFee = 0.00d;
	}

	public DaysScholar(int StudentId, String name, double examfee, double TransportFee)
	{
		super(StudentId, name, examfee);
		this.TransportFee = TransportFee;
	}
	
	String displayDetails()
	{
		return "DaysScholar [StudentId=" + StudentId + ", name=" + name + ", examfee=" + examfee + ", TransportFee=" + TransportFee + "]";
	}

	double payFee(double amount)
	{
		return super.payFee(amount) + TransportFee;
	}
}
