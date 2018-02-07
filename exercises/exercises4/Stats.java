package exercises4;

import sedgewick.StdIn;
import cse131.ArgsProcessor;

public class Stats {

	public static void main(String[] args) {
		// prompt the user for the file to be used for this run
		ArgsProcessor.useStdInput("datafiles/average/");

		//
		//  Read in the data from the opened file, computing the
		//     sum, average, count, max, and min
		//  of the data
		//
		//  count is the number of doubles read from the file
		//  The other statistics should be clear from their names
		// global varibal 
		int count = 0;
		double sum = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		//compare loop
		while (! StdIn.isEmpty()) {
			double i = StdIn.readDouble();
			sum = sum + i;
			count ++;
			if (i > max) {
				max = i;
			}
			if(i < min) {
				min = i;
			}
		}
		System.out.println("With " + count + " numbers");
		System.out.println("The sum is " + sum);
		System.out.println("The avergae is " + (sum/count));
		System.out.println("The maximum number is " + max);
		System.out.println("The maximum number is " + min);

	}

}
