package speeding;
import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		// input variables
		int speed = ap.nextInt("Enter the speed at which you were caught :");
		int spdLimit = ap.nextInt("Enter the speed limit of the raod :");
		
		// calculation
		
		//while loop for speeding
		if (speed > spdLimit) {
		   int spdDiff = speed - spdLimit;
			  // when speeding over 10mph over limit
			  if (spdDiff > 10) {
			 	 int overCost = (spdDiff - 10) * 10;
				 int fineBig = 50 + overCost;
				 System.out.println("You are speeding over 10mph over the limit, your fine is : " + fineBig + " dollors.");
			  }
			  else {
		         System.out.println("You are not speeding under the 10mph over the limit, your fine is: " + 50 + " dollars");
			  }
	     }
		else {
			System.out.println("Good, you are not speeding !");
		};

}
}