package studio2;

import cse131.ArgsProcessor;

public class Ruin {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// global variables
		int srt = ap.nextInt("Enter the amount of money that you start with : ");
		int startAmount = srt;
		double winChance = ap.nextDouble("Enter the probability that you win a gamble (smaller than 1) : ");
		int winAmount = ap.nextInt("If you reach this amount of money, then you won : ");		
		int totalPlays = ap.nextInt("The number of times you simulate the problem : ");		
		int i = 1;
		int round = 0;
		double win = 0.0;
		double lossChance = 1 - winChance;
		double Ruin;
		
		// experiment 
		while (i <= totalPlays) {
			boolean result = false;
			while (startAmount > 0 && startAmount < winAmount) {
				double t = Math.random();
				if (t > winChance) {
					startAmount = startAmount - 1;
				}
				else {
					startAmount = startAmount + 1;
				}
				round = round + 1; 	
			}
			if (startAmount == winAmount) {
			win = win + 1;
			result = true;	
			}
		System.out.println("Simulation " + i + ":   " + round + " rounds \t" + ((result) ? " win":" loose") );
		i = i + 1;
		round = 0; //reset round counter
		startAmount = srt; //reset money
		}
		// calculate win time versus experiment 
		System.out.println("Losses :" + (int)(totalPlays - win) + "\t    Simulations: " + totalPlays);
		//calculate ruin probability 
		if (lossChance != winChance) {
			Ruin = (Math.pow(lossChance/winChance, startAmount) - Math.pow(lossChance/winChance, winAmount)) / (1 - Math.pow(lossChance/winChance, winAmount));
		}
		else {
			Ruin = 1 - startAmount / winAmount;
		}
		System.out.println("Actual Ruin rate: " + ( (totalPlays - win)/totalPlays ) + "\t Expected Ruin rate: " + Ruin );
	}


}
