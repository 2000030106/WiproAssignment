package assignments;

public class Savings extends Bank
{
	double savRate;
	public Savings(String accNo, String custName, int custGender, String custJob, double curBal,double saveRate) {
		super(accNo, custName, custGender, custJob, curBal);
		this.savRate=savRate;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcBalance() {
		return curBal + (savRate * curBal);		
	}

	
	
	
	

}
