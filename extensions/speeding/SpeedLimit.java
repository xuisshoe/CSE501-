package speeding;
import cse131.ArgsProcessor;

public class SpeedLimit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		// input variables
		int speed = ap.nextInt("Enter your reported speed :");
		int spdLimit = ap.nextInt("Enter the speed limit of the raod :");
		//calculating speed and fine
		int spdDiff = speed - spdLimit;
		int spdNot = (spdDiff > 0) ? 1:0;
		int spdOver = (spdDiff > 0) ? spdDiff:0;
		int spdBig = (spdOver > 10) ? 1:0;
		int spdFine = (50 + spdBig*(spdDiff - 10)*10)*spdNot;
		
		
		// calculation
		
		
		System.out.println("You reported a speed of " + speed + " MPH for a speed limit of " + spdLimit + " MPH.");
			 
		System.out.println("You went " + spdOver + " MPH over the speed limit.");
		
		System.out.println("Your fine is $" + spdFine + ".");
	

}
}