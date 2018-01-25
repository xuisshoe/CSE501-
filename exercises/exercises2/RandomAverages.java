package exercises2;

public class RandomAverages {

	public static void main(String[] args) {
		//
		// Write a loop that computes the average
		//     of 1, 2, ... 1000 doubles
		// In each iteration of that loop, print
		//     the average of the doubles generated
		//     thus far.
		//
		// Your code goes below here.
		int n = 0;
		double sum = 0.0;
		while (n < 1000) {
			n ++;
			sum = sum + Math.random();
			double average = sum / n;
			// Uncomment to have output by each step
			// System.out.println("At " + n + " inerations, the average is " + average);
			//
			// Code to print output every 100 steps of iterations.
			if (n%100 == 1) {
			System.out.println("At " + n + " inerations, the average is " + average);
			
			}
		}
		
		
		//
		//  Some questions:
		//    1) How does the average change as your loop progresses?
		// 		It is approaching 0.5.
		//    2) Can you write code in your loop that prints out the average only
		//         every 100 iterations, instead of each iteration?
		// 		Use "if(n%100 = 1)" can produce out put every 100 iterations.
		//
		
	}

}
