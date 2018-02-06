package lab3;

import cse131.ArgsProcessor;

public class dice1 {

	public static void main(String[] args) {
		// a sample one time throw dice simulation with n optional dice numbers
		ArgsProcessor ap = new ArgsProcessor(args);
		// input the number of dice  
		int n = ap.nextInt("Please enter the number of dice you want to roll: ");	
		int m = ap.nextInt("Please enter the number you want to roll: ");	
		// condition for dice = 1
		for(int j = 0; j < m; j++) {
			
		
			int diceVal[] = new int[n];	
			for (int i = 0; i < n; i++ ) {
				//generate a random number 
				double val = Math.random();
				for(int d = 0; d < 6; d++) {
					// loop to check the random generated value
					if ( (double)d/6 < val && val < (double)(d+1)/6 ) {
						int diceOut = d + 1;
						diceVal[i] = diceOut;
						//System.out.print(val);
						//System.out.println(d);
						//System.out.println((double)d/6);
						//System.out.println((double)(d+1)/6);
						//System.out.print("    Dice number is : " + diceOut + "   ");
						break;
					}
				}
				System.out.print("  " + diceVal[i] + "  ");
				int eqtime = 0;
				for(int k = 0; k < n-1; k++) {
					if (diceVal[i] == diceVal[i+1]) {
						eqtime = eqtime + 1;
					}
				
				}
				
			}
			System.out.println("  ");
		}
		
		
	}

}






