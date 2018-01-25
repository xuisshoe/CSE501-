package exercises2;

import cse131.ArgsProcessor;

public class Max {

	public static void main(String[] args) {
		//
		// Below, prompt the user for two ints, x and y
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Enter the value of x :");
		int y = ap.nextInt("Enter the value of y :");
		//
		// Now use what you have learned about conditional
		//   execution to print the larger of the two values.
		//
		if (x > y){
			System.out.println("The max between " + x + " and " + y + " is " + x);
		}
			
		else {
			if (x == y) {
				System.out.println("Two numbers are equal.");
			}
			else {
				System.out.println("The max between " + x + " and " + y + " is " + y);
			}
		}
		
		//
		// Run this program testing on various inputs for
		//    x and y:  some where x < y, some where x > y,
		//              some where x == y

	}

}
