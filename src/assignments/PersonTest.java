package assignments;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Person athlete = new Athlete();
	Person lazyperson = new LazyPerson();
	
	System.out.println("Athlete Methods:");
	athlete.eat();
	athlete.exercise();
	System.out.println("***********");
	System.out.println("Lazy Person Methods:");
	lazyperson.eat();
	lazyperson.exercise();
	
	}

}

/*
 * output:
 * Athlete Methods:
Athelete Eats Healthy Food like Protein Powder and syrups
Athlete Do exercise Every Day To be fit for Running champions
***********
Lazy Person Methods:
Lazy Person eats Junk Food order on online 
Lazy Person Does not do Exercise
*/
