package SpringAssignments;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.ShoppingService;

public class ShoppingaopMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
        ShoppingService service = context.getBean("shoppingService", ShoppingService.class);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Shopping Menu ---");
            System.out.println("1. Add to Cart");
            System.out.println("2. Make Payment");
            System.out.println("3. Place Order");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter item to add: ");
                    String item = sc.nextLine();
                    service.addToCart(item);
                    break;
                case 2:
                    System.out.print("Enter payment amount: ");
                    double amount = sc.nextDouble();
                    service.makePayment(amount);
                    break;
                case 3:
                    service.placeOrder();
                    break;
                case 0:
                    System.out.println("Exiting. Thank you!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
	}

}

/*
 * 
--- Shopping Menu ---
1. Add to Cart
2. Make Payment
3. Place Order
0. Exit
Enter your choice: 1
Enter item to add: laptop
[Before] Method execution started.
Item added to cart: laptop
[Around] Method addToCart took 29ms
[AfterReturning] Method executed successfully.

--- Shopping Menu ---
1. Add to Cart
2. Make Payment
3. Place Order
0. Exit
Enter your choice: 2
Enter payment amount: 65000
[Before] Method execution started.
Payment made of amount: 65000.0
[Around] Method makePayment took 0ms
[AfterReturning] Method executed successfully.

--- Shopping Menu ---
1. Add to Cart
2. Make Payment
3. Place Order
0. Exit
Enter your choice: 3
[Before] Method execution started.
Order placed successfully.
[Around] Method placeOrder took 0ms
[AfterReturning] Method executed successfully.

--- Shopping Menu ---
1. Add to Cart
2. Make Payment
3. Place Order
0. Exit
Enter your choice: 0
Exiting. Thank you!
*/
