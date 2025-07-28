package assignments;


abstract class Vehicle1 
{
	public  abstract void startEngine();
	public  abstract void stopEngine();
}


class Car1 extends Vehicle1{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car Engine Started with a key");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car Engine stopped with key");
		
	}

}


class MotorCycle extends Vehicle1{

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Motor Cycle Engine is started with kick or self start");
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
        System.out.println("Motorcycle Engine stopped using the kill switch.");

	}

}


public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 car = new Car1();
		Vehicle1 motorcycle = new MotorCycle();
		
		System.out.println("=== Car Actions ===");
        car.startEngine();
        car.stopEngine();

        System.out.println("\n=== Motorcycle Actions ===");
        motorcycle.startEngine();
        motorcycle.stopEngine();

	}

}


/*output:
 * 
 * === Car Actions ===
Car Engine Started with a key
Car Engine stopped with key

=== Motorcycle Actions ===
Motor Cycle Engine is started with kick or self start
Motorcycle Engine stopped using the kill switch.

 */ 
