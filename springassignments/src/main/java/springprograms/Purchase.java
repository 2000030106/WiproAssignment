package springprograms;

import java.util.Date;

public class Purchase 
{
	private int purid;
	private Date purdate;
	private Product product;
	public Purchase(int purid, Date purdate, Product product) {
		super();
		this.purid = purid;
		this.purdate = purdate;
		this.product = product;
	}
	
	public void displaypurchasedetails() {
        System.out.println("Purchase ID: " + purid);
        System.out.println("Purchase Date: " + purdate);
        System.out.println("Product Details:");
        product.displayproductdetails();
    }

}
