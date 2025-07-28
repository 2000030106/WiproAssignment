package zoo;

import org.animals.*;


public class VandalurZoo {
	public static void printAnimalDetails(String color, double weight, int age, boolean isVeg, boolean canClimb, String sound) {
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age: " + age + " years");
        System.out.println("Is Vegetarian? " + isVeg);
        System.out.println("Can Climb? " + canClimb);
        System.out.println("Sound: " + sound);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion = new Lion();
        Tiger tiger = new Tiger();
        Deer deer = new Deer();
        Monkey monkey = new Monkey();
        Elephant elephant = new Elephant();
        Giraffe giraffe = new Giraffe();

        System.out.println("=== Lion ===");
        printAnimalDetails(lion.color, lion.weight, lion.age, lion.isvegetarian(), lion.canclimb(), lion.sound());

        System.out.println("\n=== Tiger ===");
        printAnimalDetails(tiger.color, tiger.weight, tiger.age, tiger.isvegetarian(), tiger.canclimb(), tiger.sound());

        System.out.println("\n=== Deer ===");
        printAnimalDetails(deer.color, deer.weight, deer.age, deer.isVegetarian(), deer.canClimb(), deer.sound());

        System.out.println("\n=== Monkey ===");
        printAnimalDetails(monkey.color, monkey.weight, monkey.age, monkey.isVegetarian(), monkey.canClimb(), monkey.sound());

        System.out.println("\n=== Elephant ===");
        printAnimalDetails(elephant.color, elephant.weight, elephant.age, elephant.isVegetarian(), elephant.canClimb(), elephant.sound());

        System.out.println("\n=== Giraffe ===");
        printAnimalDetails(giraffe.color, giraffe.weight, giraffe.age, giraffe.isVegetarian(), giraffe.canClimb(), giraffe.sound());
    }

        
	}


/*
 * output:
 * 
 * === Lion ===
Color: Red
Weight: 90.0 kg
Age: 67 years
Is Vegetarian? false
Can Climb? true
Sound: Lion Makes Roar

=== Tiger ===
Color: Orange
Weight: 75.9 kg
Age: 45 years
Is Vegetarian? false
Can Climb? true
Sound: Tiger Makes Growl

=== Deer ===
Color: Brown
Weight: 60.0 kg
Age: 6 years
Is Vegetarian? true
Can Climb? false
Sound: Bleat

=== Monkey ===
Color: Black
Weight: 80.02 kg
Age: 30 years
Is Vegetarian? true
Can Climb? true
Sound: Chatter

=== Elephant ===
Color: Grey
Weight: 1000.02 kg
Age: 40 years
Is Vegetarian? true
Can Climb? false
Sound: Trumpet

=== Giraffe ===
Color: Yellow
Weight: 800.02 kg
Age: 30 years
Is Vegetarian? true
Can Climb? false
Sound: Hum
*/


