package exercises2;

import cse131.ArgsProcessor;

public class Heads {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many times to run the experiment :");
		// sum of all flips to get 10 heads
		double sumFlip = 0; 
		
	    //beginning of the loop 
	    for (int i = 0; i<N; i++) {
		   // what are the concepts?
		   int numHeads = 0;
		   int numFlips = 0;

		   // now flip a coin until we see 10 heads
		   while (numHeads != 10) {
			   boolean isHeads = Math.random() < 0.5;
			   if (isHeads) {
				   numHeads = numHeads + 1;
			   }
			   numFlips = numFlips + 1;

		   }
		   // here, numHeads should be 10
		   sumFlip = sumFlip + numFlips;
		   //System.out.println("Number of flips was " + numFlips);
	    }
	    System.out.println("Avergae of flips to het 10 heads is " + (sumFlip/N));
	}

}
