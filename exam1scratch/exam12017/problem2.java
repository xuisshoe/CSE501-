package exam12017;
import cse131.ArgsProcessor;

public class problem2 {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//// part a ////
		/*
		 * Complete the code below so that it computes and prints the integer
		 * division of a/(a-b), if a-b is not zero. If a-b is zero, the code should print Error.
		 */
		int a = ap.nextInt("Value for a?");
		int b = ap.nextInt("Value for b?");
		if (a-b != 0) {
			System.out.println("Problem a: Print the integer division of a/(a-b) :" + a/(a-b) );
		}
		else {
			System.out.println("Problem a: The denominator is zero, error");
		}
		
		//// part b ////
		/*
		 * Complete the code below so that it determines how many of N random
		//numbers are less than 0.5, with each random number chosen by a call to
		//Math.random(). Recall that each call to Math.random() returns a double r
		//such that 0 ≤ r < 1. Do not use any arrays! Your code should produce output
		//such as the following (in the example below, I typed 100 in response to the
		//prompt):
		//You asked for 100 random numbers.
		//Of those, 63 were less than 0.5.
		//Your output will depend on the value of N supplied when the program is run, as
		//well as the results of the calls to Math.random().
		//int N = ap.nextInt("How many random numbers?");
		 */
		int N = ap.nextInt("How many random numbers?");
		int smlNum = 0;
		for (int i = 0; i<N; i++) {
			double k = Math.random();
			if( k<0.5 ) {
				smlNum++;
			}
		}
		System.out.println("You asked for "+ N + " random numbers.");
		System.out.println("Of those, " + smlNum + " were less than 0.5.");
	}
	

}
