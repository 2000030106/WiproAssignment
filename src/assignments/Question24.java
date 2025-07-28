package assignments;

import java.util.Scanner;

public class Question24 {

	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Size of Array");
	        int size=sc.nextInt();
	        int[] speeds = new int[size];
	        int total = 0;

	        System.out.println("Enter speeds of 5 bikers:");
	        for (int i = 0; i < size; i++) {
	            System.out.print("Speed of biker " + (i + 1) + ": ");
	            speeds[i] = sc.nextInt();
	            total += speeds[i];
	        }

	        double average = total / 5.0;
	        System.out.println("\nAverage speed: " + average);

	        System.out.println("Qualifying racers (speed > average):");
	        
	        boolean found = false;
	        for (int i = 0; i < size; i++) {
	            if (speeds[i] > average) {
	                System.out.println("Biker " + (i + 1) + " with speed " + speeds[i]);
	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No biker qualified.");
	        }

	        
	    }
	}

/*
 * output:
 * Size of Array
5
Enter speeds of 5 bikers:
Speed of biker 1: 78
Speed of biker 2: 85
Speed of biker 3: 95
Speed of biker 4: 45
Speed of biker 5: 65

Average speed: 73.6
Qualifying racers (speed > average):
Biker 1 with speed 78
Biker 2 with speed 85
Biker 3 with speed 95
*/
 



