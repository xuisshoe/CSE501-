package exercises2;

public class Loops {

	public static void main(String[] args) {

		// 0 to 9 inclusively
		//    produces  0 1 2 3 4 5 6 7 8 9
		int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
			}
		System.out.println(" ");
		
		
		// 1 to 10 inclusively
		//    produces 1 2 3 4 5 6 7 8 9 10
		int n = 1;
		while (n <= 10) {
			System.out.print(n + " ");
			n++;
			}
		System.out.println(" ");
		
		
		// 0 to 10, including 0, excluding 10
		//    produces 0 1 2 3 4 5 6 7 8 9
		int k = 0;
		while (k < 10) {
			System.out.print(k + " ");
			k++;
			}
		System.out.println(" ");
		
		
		
		// like the one above, but jumping by 2
		//    produces 0 2 4 6 8
		int l = 0;
		while (l < 10) {
			System.out.print(l + " ");
			l = l + 2;
			}
		System.out.println(" ");	
		
		
		
			
	
	
	}

}
