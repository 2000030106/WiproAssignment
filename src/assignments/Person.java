package assignments;

public abstract class Person 
{
	public abstract void eat();
	public abstract void exercise();

}

class Athlete extends Person
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Athelete Eats Healthy Food like Protein Powder and syrups");
		
	}

	@Override
	public void exercise() {
		// TODO Auto-generated method stub
		System.out.println("Athlete Do exercise Every Day To be fit for Running champions");
		
	}
	
}

class LazyPerson extends Person
{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Lazy Person eats Junk Food order on online ");
		
	}

	@Override
	public void exercise() {
		// TODO Auto-generated method stub
		System.out.println("Lazy Person Does not do Exercise");
	}
	
}
