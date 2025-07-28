package assignments;

import java.util.Scanner;

public class Question5 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Salary:");
		double salary=sc.nextDouble();
		System.out.println("Enter The service ");
		int service=sc.nextInt();
		
		double bonusamount=salary*12+0.1;
		if(service>6) {
			System.out.println(bonusamount);
		}
		else {
			System.out.println(salary);
		}
	}

}

/*
 * output:
 * Enter The Salary:
75000
Enter The service 
7
900000.1
*/
