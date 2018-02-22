package exercises5;

public class StringMethods {
	
	//
	// Below are the methods defined for this exercise
	//   The names are not prescribed in the assignment, so choose
	//   names you like (that are meaningful)
	//
	
	//
	// First one is completed for you:
	//
	
	public static String selfConcat(String s) {
		//return s + s; rewrite it to use the second method
		return ncopy(s,2);
	}
	// method n copy
	public static String ncopy(String s, int n) {
		//String copy = "";
		//for (int i = 0; i < n; i++) {
			//copy = copy + s;
		//}
		// rewrite the code using join
		String [] array = new String[n];
		for (int i = 0; i < n; i++) {
			array[i] = s;
		}
		return join(array,"");
		
	}
	// write the inverse split method
	public static String join(String[] array, String joiner) {
		if (array.length == 0) {
			return "";
		}
		String ans = array[0];
		for(int i = 1; i < array.length; i++ ) {
			ans = ans + joiner + array[i];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		
		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(ncopy("echo",5));
		for(int i = 0; i < 5; i++ ) {
			System.out.println(ncopy(" BAT-MAN ",i));
		}
		// test the split function
		String s = "I like computer science!";
		String[] words = s.split(" ");
		for (String w : words) {
			System.out.println(" word: " + w);
		}
		// calling the method join and print it 
		System.out.println("Back together: " + join(words," "));
	}

}
