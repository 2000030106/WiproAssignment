package assignments;

public abstract class Bank {
	
	String accNo;
    String custName;
    int custGender;  
    String custJob;
    double curBal;
    
    
    
	public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
		super();
		this.accNo = accNo;
		this.custName = custName;
		this.custGender = custGender;
		this.custJob = custJob;
		this.curBal = curBal;
	}

	public abstract double calcBalance();

	public String toString() {
        return "Account No: " + accNo + "\nName: " + custName + "\nGender: " + 
               (custGender == 1 ? "Male" : "Female") + "\nJob: " + custJob + 
               "\nCurrent Balance: RM " + String.format("%.2f", curBal);
    }

	

}
