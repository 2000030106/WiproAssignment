package assignments;

import java.util.Scanner;

class Worker
{
	public String  name;
	public double salaryrate;
	
	
	public Worker(String name, double salaryrate) {
		super();
		this.name = name;
		this.salaryrate = salaryrate;
	}


	public double pay(int hours)
	{
		return hours;
	}
	
}
class DailyWorker extends Worker
{
	public DailyWorker(String name, double salaryrate) {
		super(name,salaryrate);
		
	}
	@Override
	public double pay(int hours) {
		int dayswork= hours/8;
		return dayswork*salaryrate;
	}
	
}
class SalariedWorker extends Worker{

	public SalariedWorker(String name, double salaryrate) {
		super(name, salaryrate);
		
	}
	
	@Override
	public double pay(int hours)
	{
		
		return 40*salaryrate;
	}
	
}



public class Question13 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter DailyWorker Name:");
		String sd=sc.nextLine();
		System.out.println("Enter Daily Worker Salary Rate:");
		double dsalaryrate=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter SalariedWorker Name:");
		String sww=sc.nextLine();
		System.out.println("Enter Salary Rate:");
		double swsalaryrate=sc.nextDouble();
		
		int hourswork=sc.nextInt();
		
		DailyWorker d = new DailyWorker(sd, dsalaryrate);
		System.out.println("hours:"+hourswork+"salary:"+d.pay(hourswork));
		SalariedWorker sw= new SalariedWorker(sww, swsalaryrate);
		System.out.println("hours:"+hourswork+"Salary:"+sw.pay(hourswork));
	}

}


/*
 * output:
 * 
 * Enter DailyWorker Name:
Satya
Enter Daily Worker Salary Rate:
1000
Enter SalariedWorker Name:
Sai
Enter Salary Rate:
800
48
hours:48salary:6000.0
hours:48Salary:32000.0

*/
