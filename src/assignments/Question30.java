package assignments;

import java.util.Scanner;


	interface MinFinder {
	    double minimum3(double s1, double s2, double s3);
	}

	public class Question30 {

	    
	    public static double findMinOfThree(double a, double b, double c) {
	        return Math.min(a, Math.min(b, c));
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first floating-point number:");
	        double s1 = scanner.nextDouble(); 

	        System.out.println("Enter the second floating-point number:");
	        double s2 = scanner.nextDouble(); 

	        System.out.println("Enter the third floating-point number:");
	        double s3 = scanner.nextDouble(); 

	       
	        MinFinder finder = Question30::findMinOfThree;

	        double smallestValue = finder.minimum3(s1, s2, s3);

	        System.out.printf("The smallest of %.2f, %.2f, and %.2f is: %.2f%n", s1, s2, s3, smallestValue);

		    }
	}


