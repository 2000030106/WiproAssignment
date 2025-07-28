package assignments;

import java.util.Scanner;

public class Question7 
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
			
			System.out.println("Not Allowed to sit");
			

		}
	}

}

/*
 * output:
 * Enter Total Classes:
100
Enter Attended Classes:
80
80.0%
Allowed to sit
*/
