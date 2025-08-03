package springprograms;

public class Product {
	private int pid;
	private String pname;
	private double pprice;
	public Product(int pid, String pname, double pprice) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
	}
	
	public void displayproductdetails()
	{
		System.out.println("Product Id:"+pid);
		System.out.println("Peoduct Name:"+pname);
		System.out.println("Peoduct Price :"+pprice);
	}

}
