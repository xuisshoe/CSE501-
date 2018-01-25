package studio2;

import cse131.ArgsProcessor;
public class Ruin {

	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		//startAmount, the amount of money that you start with
		int startAmount = ap.nextInt("Enter the amount of money that you start with : ");
		//winChance The probability that you win a gamble
		double winChance = ap.nextDouble("Enter the probability that you win a gamble (smaller than 1) : ");
		//winAmount If you reach this amount of money, then you won
		int winAmount = ap.nextInt("If you reach this amount of money, then you won : ");
		// totalPlays The number of times you simulate the problem
		int totalPlays = ap.nextInt("The number of times you simulate the problem : ");
		//iteration counter
		int i = 0;
		//round counter
		int round = 0;
		//loose times
		int lost = 0;
		
		// loss chance is 1 - winchance
		double lossChance = 1.0 - winChance; 
		
		
		//
		//
		// calculating probability 
		
		while ( i < totalPlays ) {
			while (startAmount > 0 || startAmount == winAmount) {
				//win condition
				double t = Math.random(); // generate random number
				if (t <= winChance) {
					startAmount = startAmount + 1;	
				}
				else {
					startAmount = startAmount - 1; 	
				}
				round++;
			}
			i++;
			if (startAmount == 0) {
				System.out.println("Simulation "+ i +": " + round + " rounds       loose" );
				lost = lost + 1;
			}
			if (startAmount == winAmount) {
				System.out.println("Simulation "+ i +": " + round + " rounds       win");	
			}
			
		}
	System.out.println("   ");// space
	System.out.println("Losses : " + lost + "   Simulations: " + i);
	double actualRuin = lost/i;
	// calculate real ruin
	if (lossChance != winChance) {
		double ruin = ( Math.pow((lossChance/winChance),startAmount) - Math.pow((lossChance/winChance),winAmount) )/( 1-Math.pow((lossChance/winChance),winAmount) );
		System.out.println("Actual Ruin Rate: " +actualRuin+ "  Expected Ruin rate: " + ruin);
	}
	else {
		double ruin = 1 - ( startAmount / winAmount );
		System.out.println("Actual Ruin Rate: " +actualRuin+ "  Expected Ruin rate: " + ruin);
	}
	
	}

}
