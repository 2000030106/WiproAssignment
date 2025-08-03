package SpringAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springprograms.Account;
import springprograms.Account1;
import springprograms.FreshMan;
import springprograms.Item;
import springprograms.Purchase;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Account acc = (Account) context.getBean("account");
        acc.displayDetails();
    	
        System.out.println("*********************************");

        FreshMan freshman = context.getBean("freshman", FreshMan.class);
        System.out.println("Name: " + freshman.getName());
        System.out.println("Dorm Location: " + freshman.getRoom().getLocation());
        
        System.out.println("**********************************");
        
        Account1 acc1 = context.getBean("account1", Account1.class);
        acc1.displayDetails();
    
        System.out.println("**********************************");
        
        Item item = context.getBean(Item.class);
        item.displayDetails();
        
        System.out.println("**********************************");

        Purchase purchase = context.getBean("purchase", Purchase.class);
        purchase.displaypurchasedetails();
        
        
    }
}



/*
Account Number: 491826345
Account Holder: Satya Sai
Balance: 25000.75
Bank ID: 101, Bank Name: central Bank of India
*********************************
Name: Satya Sai
Dorm Location: Room 202, Aravali Block
**********************************
Account Number: 987654
Holder: SatyaSai
Balance: ₹65000.5
Type: Savings
**********************************
Item ID: 100
Item Name: Laptop
Item Price: 60000.0
Category ID: 1000
Category Name: Electronics
**********************************
Purchase ID: 1000
Purchase Date: Sun Aug 03 16:44:11 IST 2025
Product Details:
Product Id:1
Peoduct Name:Mobile
Peoduct Price :25000.0
*/