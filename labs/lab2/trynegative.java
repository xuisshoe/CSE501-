package lab2;
import cse131.ArgsProcessor;

public class trynegative {
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArgsProcessor ap = new ArgsProcessor(args);
	// input the starting sticks number, to avoid winning by first step, this number should be greater than 2 + 2.
	int startStick = 0; 
	while (startStick < 5) {
		startStick = ap.nextInt("Please enter the number of stickis to start the game (no less than 5): ");
	}
	//game playing
	// who start 
	int whoStart = 0;
	while (whoStart < 1 || whoStart > 2) {
		whoStart = ap.nextInt("Do you want to be first or second player? (Please type 1 or 2) :") ;
	}
			
	//human first
	if (whoStart == 1) {
		System.out.println("Human starts ");	
		int round = 0;  //round counter 
		int numStick = startStick;
		while (numStick > 0) {
			int Hmove = 0;
			while(Hmove > 2 || Hmove <1) {
			Hmove = ap.nextInt("How many sticks you want to remove this time (1 or 2):");
			}
			//human step calculation
			int diffH = numStick - Hmove;
			if (diffH >= 0) {
				System.out.println("Round " + round + ", " + numStick + " sticks at start, human took " + Hmove + ", so " + diffH + " sticks remain");
				numStick = numStick - Hmove;
			}
			else {
				diffH = 0;
				System.out.println("Round " + round + ", " + numStick + " sticks at start, human took " + Hmove + ", so " + diffH + " sticks remain");
			    break;
			}
			//numStick = numStick - Hmove;
			//if (numStick == 0) {break;}
			round ++;
			int Cmove =  (Math.random() <= 0.5) ? 1 : 2 ;
			// computer step calculation
			int diffC = numStick - Cmove;
			if(diffC >= 0) {
				System.out.println("Round " + round + ", " + numStick + " sticks at start, computer took " + Cmove + ", so " + diffC + " sticks remain");
				numStick = numStick - Cmove;
			}
			else {
				diffC = 0;
				System.out.println("Round " + round + ", " + numStick + " sticks at start, computer took " + Cmove + ", so " + diffC + " sticks remain");
				break;
			}
			round ++;
		}
		if (round % 2 == 1) {  
			   System.out.println("Human wins");
		}
		else {
			System.out.println("Computer wins");
		}
	}
}
}
