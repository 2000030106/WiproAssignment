package assignments;

import java.util.Scanner;

public class Question9 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		
		double retail=0;
		
		char option ='Y';
		
		do {
			System.out.println("Enter the Product number:");
			int productnumber=sc.nextInt();
			
			System.out.println("Enter Quantities");
			int quantity=sc.nextInt();
			double price=0;
			switch (productnumber) {
			case 1:
				price=22.50;
				break;
			case 2:
				price=44.50;
				break;
			case 3:
				price=9.98;
				break;
			default:
				System.out.println("Invalid Product Number");
				continue;
			}
			
			double productstotal = price *quantity;
			retail+=productstotal;
			System.out.printf("Product Number: %d, Quantity: %d, Price: ₹%.2f, Total: ₹%.2f\n",productnumber,quantity,price,productstotal);
			
			System.out.println("Do want to continue:");
			 option=sc.next().charAt(0);
			
		} while (option=='Y' || option =='y');
		System.out.println("total retail price:"+retail);
	}

}


/*
 * output:
 * Enter the Product number:
1
Enter Quantities
3
Product Number: 1, Quantity: 3, Price: ₹22.50, Total: ₹67.50
Do want to continue:
y
Enter the Product number:
3
Enter Quantities
4
Product Number: 3, Quantity: 4, Price: ₹9.98, Total: ₹39.92
Do want to continue:
n
total retail price:107.42
*/
