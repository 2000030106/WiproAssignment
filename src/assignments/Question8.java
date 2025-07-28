package assignments;

import java.util.Scanner;

public class Question8 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Classes:");
		int totalclass=sc.nextInt();
		System.out.println("Enter Attended Classes:");
		int attended=sc.nextInt();
		float percentage=(float)attended/totalclass;
		System.out.println(percentage*100+"%");
		if(percentage>=0.70)
		{
			System.out.println("Allowed to sit");
		}
		else {
			System.out.println("Attendance is lessen than 70 %");
			System.out.println("Do you have medical cause");
			
			char c = sc.next().charAt(0);
			if(c=='Y' || c=='N' || c=='y' || c=='n')
			{
				System.out.println("Student can sit in class of medical cause");
			}
			else {
			System.out.println("Not Allowed to sit");
			}

		}
	}


}

/*
 * output:
 * Enter Total Classes:
100
Enter Attended Classes:
30
30.000002%
Attendance is lessen than 70 %
Do you have medical cause
Y
Student can sit in class of medical cause
*/
