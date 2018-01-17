package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		// prompting how many penies total 
		ArgsProcessor ap = new ArgsProcessor(args);
		
		// calculating money
		int totalPeny = ap.nextInt("Total number of penies ?");
		int totalDollar = totalPeny / 100;
		int totalQuarter = (totalPeny % 100) / 25;
		int totalDime = (totalPeny % 100 % 25)/ 10;
		int totalNickle = (totalPeny % 100 % 25 % 10) / 5;
		int leftPeny = totalPeny % 100 % 25 % 10 % 5;
		
		//print out result
		System.out.println("For " + totalPeny + "pennies :" );
		System.out.println( totalDollar + "dollars");
		System.out.println( totalQuarter + "dquarters");
		System.out.println( totalDime + "dimes");
		System.out.println( totalNickle + "nickels");
		System.out.println( leftPeny + "penies");
		
		
		
		
		
		
				
		
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
	}

}
