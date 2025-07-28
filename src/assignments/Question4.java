package assignments;

import java.util.Scanner;

public class Question4 
{
	public static void main(String []args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name :");
		String s=sc.next();
		System.out.println("Enter The Roll no: ");
		int roll=sc.nextInt();
		System.out.println("Enter The Field of Interest :");
		String field=sc.next();
		
		System.out.println("Hey, my name is "+s+" and my roll number is "+roll+". My field of interest are "+field);
		
	}

}


/*
 * output:
 * Enter The Name :
SatyaSai
Enter The Roll no: 
3112
Enter The Field of Interest :
Java
Hey, my name is SatyaSai and my roll number is 3112. My field of interest are Java
*/
