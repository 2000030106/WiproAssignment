package com.mainfiles;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Product;
import com.service.ProductService;

public class ProductMain 
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
        ProductService service = (ProductService) context.getBean("productService");

        while (true) {
            System.out.println("1. Generate Bill by entering code and quantity");
            System.out.println("2. Exit");
            int choice = sc.nextInt();

            if (choice == 1) {
                int code = 0;
                while (true) {
                    System.out.print("Enter product_code: ");
                    code = sc.nextInt();
                    if (!service.validateProductCode(code)) {
                        System.err.println("Invalid product_code, it should be >0 and 4 digit +ve number");
                    } else {
                        break;
                    }
                }

                int qty = 0;
                while (true) {
                    System.out.print("Enter quantity: ");
                    qty = sc.nextInt();
                    if (!service.validateQuantity(qty)) {
                        System.err.println("Invalid quantity, it should be >0");
                    } else {
                        break;
                    }
                }

                try {
                    Product p = service.getProductDetails(code);
                    double total = service.calculatePrice(qty, p.getProduct_price());

                    System.out.println("Product Name: " + p.getProduct_name());
                    System.out.println("Product Category: " + p.getProduct_category());
                    System.out.println("Product Description: " + p.getProduct_description());
                    System.out.println("Product Price(Rs): " + p.getProduct_price());
                    System.out.println("Quantity: " + qty);
                    System.out.println("Total Bill Amount: Rs." + total);
                } catch (Exception e) {
                    System.err.println("Product not found or DB error.");
                }
            } else if (choice == 2) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Enter option 1 to 2 only");
            }
        }
        
    }

}


/*
 * 1. Generate Bill by entering code and quantity
2. Exit
1
Enter product_code: 2000
Enter quantity: 2
Product Name: Laptop
Product Category: Electronics
Product Description: DELL
Product Price(Rs): 65000.0
Quantity: 2
Total Bill Amount: Rs.130000.0
1. Generate Bill by entering code and quantity
2. Exit
2
Thank you!

*/
