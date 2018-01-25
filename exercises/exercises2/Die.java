package exercises2;

public class Die {

	public static void main(String[] args) {

		//
		// Use the random number generator
		//    (Math.random())
		// so that this program prints out one of
		// the following integers:
		//   1 2 3 4 5 6
		// with equal probability
		//
		// Note this program does not prompt the user
		//  for input, it just produces one of the
		//  above integers as output, as if by 
		//  throw of a die
		//
		double t = Math.random();
		if (t < 1.0/6.0) {
			System.out.println(" 1 ");
		}
		else if (t < 2.0/6.0 ) {
			System.out.println(" 2 ");
		}
		else if (t < 3.0/6.0 ) {
			System.out.println(" 3 ");
		}
		else if (t < 4.0/6.0 ) {
			System.out.println(" 4 ");
		}
		else if (t < 5.0/6.0 ) {
			System.out.println(" 5 ");
		}
		else {
			System.out.println(" 6 ");
		}
	}

}
