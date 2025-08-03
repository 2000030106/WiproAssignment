package service;

public class ShoppingService 
{
	public void addToCart(String item) {
        System.out.println("Item added to cart: " + item);
    }

    public void makePayment(double amount) {
        System.out.println("Payment made of amount: " + amount);
    }

    public void placeOrder() {
        System.out.println("Order placed successfully.");
    }

}
