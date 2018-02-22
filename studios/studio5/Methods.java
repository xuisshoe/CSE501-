package studio5;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static double avg3(int x, int y, int z) {
		double avg = (double) (x + y + z )/ 3.0;
		return avg;
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	public static double sumArray(double[] array) {
		double sum = 0;
		for (int i=0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}
	
	public static double average(double[] array) {
		
		return sumArray(array)/array.length;
	}
	// write my own method 
	public static int findLeast(int[] array) {
		int ans = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < ans) {
				ans = array[i];
			}
		}
		return ans;
	}
	// pig latin 
	public static String pig(String input) {
		String init = input.substring(0,1);
		String ans = input.substring(1) + init + "ay";
		return ans;	
	}


}
