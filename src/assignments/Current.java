package assignments;

public class Current extends Bank
{
	  boolean fixedDep;
	    double curRate;
		public Current(String accNo, String custName, int custGender, String custJob, double curBal, boolean fixedDep,double curRate) {
			super(accNo, custName, custGender, custJob, curBal);
			this.fixedDep=fixedDep;
			this.curRate=curRate;
			// TODO Auto-generated constructor stub
		}
		@Override
		public double calcBalance() {
			double balance = curBal + (curRate * curBal);
	        if (fixedDep) {
	            balance -= 150; // RM150 service fee
	        }
	        return balance;
	    }
		
		}
	    
	    
	    
	    


