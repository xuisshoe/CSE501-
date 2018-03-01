package exercises6;

public class sum {
	
	public static int sum (int n) {
		if (n<=0) {
			// base case 
			return 0;
		}
		else {
			//recursion case 
			return sum(n-1) + n;
		}
	}

}
