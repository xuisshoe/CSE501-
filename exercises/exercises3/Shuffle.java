package exercises3;

public class Shuffle {

	public static void main(String[] args) {
		String[] original = { "A", "B", "C", "D",
				"E", "F", "G", "H"
		};
		
		String[] shuffle = new String [original.length];

		// print out original array
		for (int i=0; i < original.length; ++i) {
			System.out.println("Original at " + i + " is " + original[i]);
		}
		// starting from the bottom of the shuffle pile 
		for (int c = original.length - 1; c >= 0; c--) {
			int p = (int) (Math.random() * (c+1));
			shuffle[c] = original[p];
			String t = original[c];
			original[c] = original[p];
			original[p] = t;
			
			
		}
		System.out.println(" ");
		for (int j = 0; j < shuffle.length; j++) {
			System.out.println("Shuffle at " + j + " is " + shuffle[j]);
		}

		
	}
	
}