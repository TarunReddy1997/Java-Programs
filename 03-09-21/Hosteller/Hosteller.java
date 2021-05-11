
public class Hosteller extends Student {
	double hostelFee;
	public Hosteller() 
	{
		double hostelFee = 0.00d;
	}

	public Hosteller(int StudentId, String name, double examfee, double hostelFee) 
	{
		super(StudentId, name, examfee);
		this.hostelFee = hostelFee;
		
	}
	
	String displayDetails()
	{
		return "Hosteller [StudentId=" + StudentId + ", name=" + name + ", examfee=" + examfee + ", hostelFee=" + hostelFee + "]";
	}
	
	double payFee(double amount)
	{
		return hostelFee + super.payFee(amount);
	}
}
