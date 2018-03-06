package exam12017;

import cse131.ArgsProcessor;

public class problem4 {
	public static void main(String[] args) {
		int nums[] = {50,81,5,-2,-2,-1,0,2};
		//(a) Complete the code below so that it sets N to the size of the nums array:
		int N = nums.length;
		/*
		 * (b) Complete the code below so that it computes the sum of all of the
		 * entries in the nums array. Given the example above, your code would produce
		 * The sum is 133.
		 */
		int sum = 0;
		for (int i = 0; i<N; i++) {
			sum = sum+ nums[i];
		}
		System.out.println("The sum is " + sum + ".");
		/*
		 * (c) Your task now is to create a sums array that contains at each element i
//		the sum of all entries in nums up to and including entry i.
//		For example, given the nums array reprised from above:
//		nums array [0] [1] [2] [3] [4] [5] [6] [7]
//		contents 50 81 5 -2 -2 -1 0 2
//		the code you are about to write would produce the sums array:
//		sums array [0] [1] [2] [3] [4] [5] [6] [7]
//		contents 50 131 136 134 132 131 131 133
//		Below, write the code to compute the sums array as described above, assuming
//		you are given a nums array of some size (not necessarily the size of our running
//		example). Do not print out anything, just compute the sums array properly. Be
//		sure to declare and allocate the sums array.
		 */
		System.out.println("The sum array is: ");
		int sums[] = new int[N];
		for (int j = 0; j < N; j++ ) {
			for (int k = 0; k <= j; k++) {
				sums[j] = sums[j] + nums[k];
			}
			System.out.print(sums[j] + " ");
		}
//		/*
//		 *Finally, given the sums array as described above, write code below
//		that prints each index i of sums at which the entry 131 appears.2
//		In our running
//		example, the output would be:
//		At 1
//		At 5
//		At 6 
//		 */
		int counter = 0;
		System.out.println("  ");
		for (int i = 0; i < N; i++) {
			if(sums[i] == 131) {
				counter = counter + 1;
				System.out.println("The #" + counter + " index of 131 is at: " + i);
			}
		}
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int n = ap.nextInt("enter the number of reducers: ");
		String letter = ap.nextString("enter the number you want to sort");
		int increment = ('z'-'a')/n;
		int part = 0;
		for (int i = 'a'; i < 'z'; i = i + increment) {
			int init = letter.charAt(0);
			if (init > (i + increment) & init>=i) {
				System.out.println(part);
			}
			part = part + 1;
		}
	}

}
