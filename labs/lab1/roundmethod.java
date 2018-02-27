package lab1;

public class roundmethod {
	public static double round(double n) {
		double m =   (int) Math.round(n*1000);
		return m/1000;
	}

	public static void main(String[] args) {
		double n = 1.649999;
		System.out.println("round from " + n + " to " + round(n) );
		
		double fat = 13.6;
		double calFat = 13.6 * 9.0;
		double portionFat = calFat/271;
		//double portionFat = 0.1*Math.round((calFat/271.0)*1000);
	
		
		
		
		System.out.println("this is the portion fat round trial: " + round(portionFat) );

	}

}
