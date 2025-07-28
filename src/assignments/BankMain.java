package assignments;

import java.util.Scanner;

public class BankMain 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
        Bank[] b = new Bank[5];
        
        b[0] = new Savings("B101", "Satya", 2, "Engineer", 5000, 0.04);
        b[1] = new Current("A202", "Sai", 1, "Doctor", 7000, true, 0.05);
        b[2] = new Current("A203", "Venky", 2, "Teacher", 6000, false, 0.04);
        b[3] = new Savings("B102", "Kiran", 1, "Accountant", 8000, 0.03);
        b[4] = new Current("A204", "Srujan", 2, "Manager", 9000, true, 0.035);
        
        
        System.out.print("Enter account number : ");
        String searchAcc = sc.nextLine();
        boolean found = false;
        
        for (Bank bb : b) {
            if (bb.accNo.equalsIgnoreCase(searchAcc)) {
                found = true;
                System.out.println("\nCustomer Details:");
                System.out.println(bb.toString());
                System.out.println("Final Balance: RM " + String.format("%.2f", bb.calcBalance()));
                break;
            }
        }
        
        if (!found) {
            System.out.println("Customer with account number " + searchAcc + " not found.");
        }

        // (c) Count current account holders and total balance
        int currentCount = 0;
        double totalCurBalance = 0;
        
        for (Bank bb : b) {
            if (bb instanceof Current) {
                currentCount++;
                totalCurBalance += bb.calcBalance();
            }
        }

        System.out.println("\nTotal Current Account Holders: " + currentCount);
        System.out.println("Total Balance in Current Accounts: RM " + String.format("%.2f", totalCurBalance));

        
	}

}


/*output:
 * 
 * Enter account number : A202

Customer Details:
Account No: A202
Name: Sai
Gender: Male
Job: Doctor
Current Balance: RM 7000.00
Final Balance: RM 7200.00

Total Current Account Holders: 3
Total Balance in Current Accounts: RM 22605.00
 */

