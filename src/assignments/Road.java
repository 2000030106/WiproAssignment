package assignments;

public class Road 
{
	public  static void main(String[]args)
	{
		Truck t = new Truck(6, "Benz", "Blue");
		Bus b = new Bus(6, "Double Decker", "Orange");
		Car c = new Car(4, "BMW", "Green");
		
		System.out.println("Truck Methods:");
		t.accelerate();
		t.refuel();
		t.displaydetails();
		t.loadContainer();
		System.out.println("*******************");
		System.out.println("Bus Methods:");
		b.accelerate();
		b.refuel();
		b.displaydetails();
		b.boardPassengers();
		System.out.println("---------------------");
		System.out.println("Car Methods:");
		c.accelerate();
		c.refuel();
		c.displaydetails();
		c.playMusic();
		
	}

}

/*
 * output:
 * Truck Methods:
Vehicle will accelerate the speed of 100 kmph
Refuel for the vehicle to full tank
No of Wheels:6, Model Name :Benz, Color:Blue
This truck is Having 6 containers
*******************
Bus Methods:
Vehicle will accelerate the speed of 100 kmph
Refuel for the vehicle to full tank
No of Wheels:6, Model Name :Double Decker, Color:Orange
Passengers are Boarded to Bus
---------------------
Car Methods:
Vehicle will accelerate the speed of 100 kmph
Refuel for the vehicle to full tank
No of Wheels:4, Model Name :BMW, Color:Green
My Favourite music is PLaying

*/
