package lab1;

import cse131.ArgsProcessor;

    public class Nutrition {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		// input variables
		String name = ap.nextString("Please provide the food's name :");
		double carb = ap.nextDouble("Enter the gram of carbs the food has :");
		double fat = ap.nextDouble("Enter the gram of fat the food has :");
		double protein = ap.nextDouble("Enter the gram of protein the food has :");
		double stateCal = ap.nextInt("Enter the number of calories stated :");
		// calculating calories
		double calCarb = carb * 4;
		double calFat = (fat * 9);
		double calfat = (double)Math.round(fat*9*1000)/1000;
		double calProtein = protein * 4;
		double unCal = (double)Math.round((calCarb + calFat + calProtein - stateCal )*10)/10;
		double fiber = (double)Math.round((unCal / 4.0)*100)/100;
		
		// calculate approximate content
		//double totalWeight = ( calCarb + calFat + calProtein );
		double portionCarb = (double)Math.round( (calCarb*1000/ stateCal) )/10;
		double portionFat = (double)Math.round( (calFat / stateCal *1000.0) )/10;
		double portionProtein = (double)Math.round( (calProtein / stateCal *1000.0) )/10;
		
		//determin if healthy 
		boolean lowCarb = portionCarb < 25.0;
		boolean lowFat = portionFat < 15.0;
		
		// coin-flip whether or not to eat 
		double randNum = Math.random();
		boolean eat = randNum > 0.5;
		
		// print text 
		System.out.println(name + " has: ");
		System.out.println("   " + carb + " grams of carbohydrates = " + calCarb + " calories");
		System.out.println("   " + fat + " grams of fat = " + calfat + " calories");	
		//System.out.println("   " + fat + " grams of fat = " + calFat + " calories");	
		System.out.println("   " + protein + " grams of protein = " + calProtein + " calories");
		System.out.println("    ");
		System.out.println("This food is said to have " + stateCal + " (available) calories." );
		System.out.println("With " + unCal + " unavailable Calories, this food has " + fiber + " grams of fiber.");
		System.out.println("    ");
		System.out.println("Approximately");
		System.out.println("   " + portionCarb + "% of your food is carbohydrates");
		System.out.println("   " + portionFat + "% of your food is fat");
		System.out.println("   " + portionProtein + "% of your food is protein");
		System.out.println("    ");
		System.out.println("This food is acceptable for a low-carb diet ?  " + lowCarb);
		System.out.println("This food is acceptable for a low-fat diet ?  " + lowFat);
		System.out.println("By coin flip, should you eat this food ?  " + eat);
		
		
		
		
		
		
		
}
	
}
