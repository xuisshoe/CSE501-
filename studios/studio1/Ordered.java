package studio1;

import cse131.ArgsProcessor;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int x = ap.nextInt("Value for x?");
		int y = ap.nextInt("Value for y?");
		int z = ap.nextInt("Value for z?");
		//String name = ap.nextString("Name of the student ?");
		
	// boolean result 
	    boolean isOrdered = 	((x < y) && (y < z)) || ((x > y) && (y >z));
	    
	// average
	//   double ave = (double) (x + y)/2;
		
	// print out boolean result 
		System.out.println( isOrdered );
	// print out average result 
	//	System.out.println("The average of x and y is " + ave);
    // print out name 
	//	//System.out.println("The name of the student is " + name);
	}

}
