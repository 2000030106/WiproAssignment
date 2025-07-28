package assignments;

 public class Vehicle 
{
	public int wheels;
	public String model;
	public String color;
	

//	public Vehicle() {
//		super();
//		System.out.println("Default constructor");
//	}
	
	public Vehicle(int wheels, String model, String color) {
		super();
		this.wheels = wheels;
		this.model = model;
		this.color = color;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void accelerate()
	{
		System.out.println("Vehicle will accelerate the speed of 100 kmph");
	}
	
	public void refuel()
	{
		System.out.println("Refuel for the vehicle to full tank");
	}

	public void displaydetails()
	{
		System.out.println("No of Wheels:"+getWheels()+", Model Name :"+model+", Color:"+color);
	}
}

class Truck extends Vehicle
{

	

	public Truck(int wheels, String model, String color) {
		super(wheels, model, color);
		
	}
	

	public void loadContainer()
	{
		System.out.println("This truck is Having 6 containers");
	}
	
}

class Bus extends Vehicle
{

	public Bus(int wheels, String model, String color) {
		super(wheels, model, color);
		
	}
	
	public void boardPassengers()
	{
		System.out.println("Passengers are Boarded to Bus");
	}
	

}



class Car extends  Vehicle
{

	public Car(int wheels, String model, String color) {
		super(wheels, model, color);
	}

	public void playMusic()
	{
		System.out.println("My Favourite music is PLaying");
	}

}



