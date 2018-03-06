package lab6;

public class Methods {
	
	//
	// In this class, implement the f and g functions described on the lab page
	//
	/**
	 * 
	 * @param n
	 * @return n -10 or f(f(n+11))
	 */
	public static int f(int n ) {
		if (n>100) {
			return (n-10);
		}
		else {
			return f(f(n+11));
		}
	}
	
	public static int g(int x, int y) {
		if (x == 0) {
			return (y+1);
		}
		if (x > 0 && y == 0) {
			return g(x-1,1);
		}
		if (x > 0 && y > 0) {
			return g(x-1, g(x,y-1));
		}
		return 0;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println(f(99));
		System.out.println(f(87));
		System.out.println(g(1,0));
		System.out.println(g(1,2));
		System.out.println(g(2,6));
		
		

	}

}
