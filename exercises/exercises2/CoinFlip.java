package exercises2;
import cse131.ArgsProcessor;

public class CoinFlip {

	public static void main(String[] args) {
		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints
		// heads or tails,
		// each with probability 0.5
		//
		// This program does not prompt the user
		//   for any input.  It simply prints
		// heads or tails
		//
		if (Math.random()>0.5) {
			System.out.println("The result is the head of the coin.");
		}
		else {
			System.out.println("The result is the tail of the coin.");
		}
	}

}
