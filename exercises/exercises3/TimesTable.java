package exercises3;

import cse131.ArgsProcessor;

public class TimesTable {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Max value for table?");
		
		//  Table should include rows and columns for 0...N  
		//     mkaing N+1 rows and columns
		int[][] timesTable = new int[N + 1][N + 1];
		for (int r = 0; r <= N; r++) {
			for (int c = 0; c <= N; c++) {
				timesTable[r][c] = r * c;	
			}
		}
		// lable row
		System.out.print("      ");
		for(int c=0; c <= N; c++) {
			System.out.print(c + "  ");
		}
		System.out.println();
		for (int c=0; c <= N; c ++) {
			System.out.print("----");
		}
		System.out.println("");
		// Print the actual times table 
		
		for (int r = 0; r <= N; r++) {
			//labl the row
			System.out.print(r + "  | ");
			for (int c = 0; c <= N; c++) {
				int entry = timesTable[r][c];
				if(entry < 10) {
					System.out.print(" " + timesTable[r][c] + " ");
				}
				else {
					System.out.print(timesTable[r][c]+ " ");
				}
			}
			System.out.println();
		}
	}

}
