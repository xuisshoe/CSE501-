package expectedvalue;
import cse131.ArgsProcessor;

public class expectedvalue {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		//global variable gamer salary
		double salGamerWin = 190000;
		double salGamerLos = 5000;
		// global programming job salary by choosing a random value between $110,000 and $160,000.
		double salPrg = Math.random()*50000 + 110000;
		//global gamer wining proability 
		double p = ap.nextDouble("Enter the probability of the game start-up venture succeeding : ");
		
		//--------linear utility function
		
		// expectation for the start up
		double expGamerLinear = salGamerWin*p + salGamerLos*(1-p);
		// expectation of the programmer
		double expPrgLinear = 1*salPrg ;
		
		// -------risk-averse utility function
		
		// expectation for the start up
		double expGamerSqrt = 3*Math.sqrt(salGamerWin)*p + 3*Math.sqrt(salGamerLos)*(1-p);
		// expectation of the programmer
		double expPrgSqrt = 1*2*Math.sqrt(salPrg) ;
		
		//--------print outcome based on exp value
		// linear utility
		System.out.println("Linear Utility Function: ");
		System.out.println("Gamer: $" + (int)expGamerLinear);
		System.out.println("Programmer: $" + (int)expPrgLinear);
		// Recommendation liner 
		boolean gamerLnr = false;
		if ((int)expGamerLinear > (int)expPrgLinear){
			gamerLnr = true ;
		}
		System.out.println("You should be a gamer instead of a programmer ? " + gamerLnr);
		
		// sqrt utility 
		System.out.println("  ");
		System.out.println("Risk-Averse Utility Function: ");
		System.out.println("Linear Utility Function: ");
		System.out.println("Gamer: $" + (int)expGamerSqrt);
		System.out.println("Programmer: $" + (int)expPrgSqrt);
		// Recommendation sqrt
		boolean gamerSqrt = false;
		if ((int)expGamerSqrt > (int)expPrgSqrt){
			gamerSqrt = true ;
		}
		System.out.println("You should be a gamer instead of a programmer ? " + gamerSqrt);
		
		
	}

}
