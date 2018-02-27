package lab1;
import cse131.ArgsProcessor;
public class nutritionmethodize {
	// method that calculate the calories
	public static double calfat(double n) {
		return n * 9.0;	
	}
	// method that calculate the calories 
	public static double calcarbprotein(double n) {
		return n * 4.0;	
	}
	// method returns portion
	public static double portion(double cal, double statecal) {
		double portion = (double) (cal/statecal);
		return portion;
	}
	// method returns portion
	public static boolean eat(double n) {
		return n>0.5;
	}
	// method round to 2 decimal
	public static double round(double n) {
		double m =   (int) Math.round(n*1000);
		return m/1000;
	}	


	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		// input variables
		String name = ap.nextString("Please provide the food's name :");
		double carb = ap.nextDouble("Enter the gram of carbs the food has :");
		double fat = ap.nextDouble("Enter the gram of fat the food has :");
		double protein = ap.nextDouble("Enter the gram of protein the food has :");
		double stateCal = ap.nextInt("Enter the number of calories stated :");
		// calculating calories
		double calCarb = calcarbprotein(carb); //double calCarb = carb * 4;
		double calFat = calfat(fat); //double calFat = (fat * 9);
		double calProtein = calcarbprotein(protein);  //double calProtein = protein * 4;
		double unCal = (double) calCarb + calFat + calProtein - stateCal;
		double fiber = (double) unCal / 4.0;
		// calculate approximate content
		double portionCarb = portion(calCarb,stateCal);  //(double)Math.round( (calCarb*1000/ stateCal) )/10;
		double portionFat =  portion(calFat,stateCal);//(double)Math.round( (calFat / stateCal *1000.0) )/10;
		double portionProtein =  portion(calProtein,stateCal);//(double)Math.round( (calProtein / stateCal *1000.0) )/10;
		// if healthy 
		//determin if healthy 
		boolean lowCarb = portionCarb < 25.0;
		boolean lowFat = portionFat < 15.0;
		// coin-flip whether or not to eat 
		boolean eat = eat(Math.random());
		
		// print text 
		System.out.println(name + " has: ");
		System.out.println("   " + carb + " grams of carbohydrates = " + calCarb + " calories");
		System.out.println("   " + fat + " grams of fat = " + round(calFat) + " calories");	
		System.out.println("   " + protein + " grams of protein = " + calProtein + " calories");
		System.out.println("    ");
		System.out.println("This food is said to have " + stateCal + " (available) calories." );
		System.out.println("With " + round(unCal) + " unavailable Calories, this food has " + round(fiber) + " grams of fiber.");
		System.out.println("    ");
		System.out.println("Approximately");
		System.out.println("   " + round(portionCarb)*100 + "% of your food is carbohydrates");
		System.out.println("   " + round(portionFat)*100 + "% of your food is fat");
		System.out.println("   " + round(portionProtein)*100 + "% of your food is protein");
	    System.out.println("    ");
		System.out.println("This food is acceptable for a low-carb diet ?  " + lowCarb);
		System.out.println("This food is acceptable for a low-fat diet ?  " + lowFat);
	    System.out.println("By coin flip, should you eat this food ?  " + eat);
	 

	}

}
