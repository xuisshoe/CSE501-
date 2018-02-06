package lab3;
import cse131.ArgsProcessor;

public class Dice {

	public static void main(String[] args) {
		// Input parameter
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("Please enter the number of dice you want to roll: ");
		int m = ap.nextInt("Please enter how many times you wish to roll: ");
		// print loop to print the label row
		for (int i = 0; i < n; i++) {
			System.out.print("Dice " + (i+1) + " ");
		}
		System.out.println(" Sum");
		//draw a line to separate label and value
		for (int i = 0; i < n; i++) {
			System.out.print("-------");
		}
		System.out.println("-----");
		// global parameter
		int sameTime = 0;
		int k = 0;
		int diceSum[] = new int[m];   // dice sum array
		// loop for m times of throw
		for (int j = 0; j < m; j++) {
			int diceVal[] = new int[n];  // dice value array
			int valSum = 0;		// sum variable; to keep track of the dice value for each throw
			//loop for n dices per throw
			for (int i = 0; i < n; i++ ) {
				//generate a random number 
				double val = Math.random();
				for(int d = 0; d < 6; d++) {
					// loop to generated random dice value from 1 to 6
					if ( (double)d/6 < val && val < (double)(d+1)/6 ) {
						diceVal[i] = d + 1;
						break;
					}
			    }
				valSum = valSum + diceVal[i];		// update sum variable
				System.out.print("   " + diceVal[i] + "   ");		//print each dice value
				// once i iterate through the last value, print the sum value
				if (i == n-1 ) {
					System.out.println("  " + valSum);
					diceSum[j] = valSum;		//store the current throw sum
				}
			}
			// end of the dice throw for one time
			
			// loop to count how many same value we have for each throw
			for (int i = 0; i < n-1; i++) {
				if (diceVal[i] == diceVal[i+1]) {
					k = k + 1;
				}	
			}
			//if same value is equal to dice number then this is a same value throw, 
			if (k == n-1) {  
				sameTime = sameTime + 1; // update the same value throw by one
			}
			
		}
		// end of the m times throw 
		//draw a line separate sentence and value
		for (int i = 0; i < n; i++) {
			System.out.print("-------");
		}
		System.out.println("-----");
		//begin implement sentence
		System.out.println("All " + n + " dice have same value happened "+ sameTime + " in " + m +" times.");
		double ratio = (double) sameTime / m;
		System.out.println("The fraction is " + ratio + ".");
		// print 2nd table label
		System.out.println("----------------");
		System.out.println(" Sum  Frequency" );
		
		// copy sum array
		int diceSum1[] = new int[m];
		for (int i = 0; i< m; i++) {
			diceSum1[i] = diceSum[i];
		}
		// copmare and find same 
		int freq[] = new int[m];
		for (int i = 0; i < m; i++) {
			for(int j = 0; j < m; j++) {
				if (diceSum[i] == diceSum1[j]) {
					freq[i] = freq[i] + 1;
					diceSum1[j] = 0;
				}
			}
			if (freq[i] != 0) {
				System.out.println("  " + diceSum[i] + "    \t" + freq[i]);
			}
		}
		
		

	}

}
