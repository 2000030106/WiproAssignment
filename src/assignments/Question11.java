package assignments;

import java.util.Scanner;

class Calculator{
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
		
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	public int mul(int a,int b)
	{
		int c=a*b;
		return c;
	}
	public int div(int a,int b)
	{
		int c=a/b;
		return c;
	}
}




public class Question11 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Number:");
		int x=sc.nextInt();
		System.out.println("Enter 2nd Number:");
		int y=sc.nextInt();
		Calculator cal = new Calculator();
	System.out.println(cal.add(x,y));	
	System.out.println(	cal.sub(x, y));
	System.out.println(	cal.mul(x, y));
	System.out.println(	cal.div(x, y));
		

	}

}

/*
 * output:
 * Enter 1st Number:
10
Enter 2nd Number:
2
12
8
20
5
*/
