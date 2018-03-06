package lab6;

public class beer {
	
	public static String bottlesOfBear(int n) {
		String result = n + " bottles of beer on the wall, " + n + " bottles of beer; "
				+ "you take one down, pass it around, " + (n-1) + " bottles of beer on the wall.";
		if (n<1) {
			return " ";
		}
		return result + "\n" + bottlesOfBear(n-1);
	}

	public static void main(String[] args) {
		System.out.println(bottlesOfBear(3));

	}

}
