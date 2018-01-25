package exercises2;

import cse131.ArgsProcessor;
public class FeetInches {

	public static void main(String[] args) {
		//
		// Prompt the user for a number of inches
		//
		// Convert that into feet and inches
		//   BUT
		// Be sure to use the singular "foot" or "inch"
		//   where appropriate, as discussed in
		//   the introductory video
		//
		// For example, 61 inches would produce
		//    the output
		//   5 feet and 1 inch
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		int inchOrg = ap.nextInt("Enter the number of inchies you want to convert: ");
		int foot = inchOrg / 12 ;
		int inchLeft = inchOrg % 12;
		
		System.out.println("The result is: ");
		System.out.println("	" + foot + " feet");
		System.out.println("	" + inchLeft + " inches");
	}

}
