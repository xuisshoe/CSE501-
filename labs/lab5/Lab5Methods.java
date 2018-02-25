package lab5;

public class Lab5Methods {
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static int sumDownBy2 (int n) {
		int sum = 0;
		if (n >= 0) {
			while(n>=0) {
				sum += n;
				n -= 2;
			}	
		}
		else {
			sum = 0;
		}
		return sum;
	}
	/**
	 * 
	 * @param n
	 * @return
	 */
	public static double HarmonicSum (int n) {
		double sum = 0;
		while( n >= 1) {
			sum += 1.0/n;
			n --;
		}
		return sum;
	}
	/**
	 * 
	 * @param k
	 * @return
	 */
	public static double GeometricSum (int k) {
		double sum = 0;
		while( k >= 0) {
			sum += 1/Math.pow(2, k);
			k --;
		}
		return sum;
	}
	/**
	 * 
	 * @param j
	 * @param k
	 * @return
	 */
	public static int MultPos(int j, int k) {
		int sum = 0;
		for(int i = 0; i<k; i++) {
			sum += j;
		}
		return sum;
	}
	/**
	 * 
	 * @param j
	 * @param k
	 * @return
	 */
	public static int mult(int j, int k) {
		int sum = MultPos(Math.abs(j),Math.abs(k));
		if ( (j<0 & k<0) || (j>0 & k>0) ) {
			sum = sum * 1;
		}
		else {
			sum = sum * (-1);
		}
		return sum;
	}
	/**
	 * 
	 * @param n
	 * @param k
	 * @return
	 */
	public static int expt(int n, int k) {
		int exp = 1;
		if(k == 0) {
			exp = 1;
		}
		else {
			for(int i=1; i<=k; i++) {
				exp = exp*n;
			}
		}
		return exp;
	}
	

}
