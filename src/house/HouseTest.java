package house;

public class HouseTest 
{
	public static void main(String[] args) {
		
		Hall h = new Hall();
		Kitchen k = new Kitchen();
		
		h.display();
		System.out.println("**************");
		k.showAppliances();
	}

}
/*
 * output:
 * This is the first room while entering the house
**************
Kitchen Appliances:
Stove
Oven
Microwave
Toaster

Copied Appliances Array:
Stove
Oven
Microwave
Toaster
*/


