package studio3;
import cse131.ArgsProcessor;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("Please enter the maximum value of the range : ");
		int number[] = new int[N];
		//int p = 0;
		for (int i = 0; i < N; i++) {
			number[i] = i+2;
		}
		for (int i = 0; i < N; i++) {
			if (number[i] != 0) {
				//p++;
				int n = 2; 
				while (number[i] * n <= N+1) {
					number[ (number[i] * n) - 2 ] = 0;
					n++;
				}
				
			}
		}
		System.out.print("Prime numbers under " + N + " = ");
		for (int i = 0; i < N; i++) {
			if ( number[i] != 0) {
				System.out.print("  " + number[i]);
			}
		}
		
	}

}
