package lab2;
import cse131.ArgsProcessor;

public class Nim {

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
			int round = 0;              //round counter 
			int numStick = startStick;			//stick counter
			while (numStick > 0) {
				int Hmove = 0;
				// human take sticks, if not between 1 and 2 or greater than remaining sticks, enter again
				while( Hmove > 2 || Hmove <1 || Hmove > numStick ) {
					Hmove = ap.nextInt("Move one or two sticks (smaller than remaining sticks) ?");
				}
				System.out.println("Round " + round + ", " + numStick + " sticks at start, human took " + Hmove + ", so " + (numStick - Hmove) + " sticks remain");
				numStick = numStick - Hmove; //update number of sticks
				round ++;
				if (numStick == 0) {break;} // if reaches 0 stick then break before calculating next step
				int Cmove = 0;
				while (Cmove < 1 || Cmove > numStick) {
					Cmove =  (Math.random() <= 0.5) ? 1 : 2 ;  //randomly pick 1 or 2
				}
				System.out.println("Round " + round + ", " + numStick + " sticks at start, computer took " + Cmove + ", so " + (numStick - Cmove) + " sticks remain");
				numStick = numStick - Cmove;   // update number of sticks
				round ++;
			}
			// winning strategy, if the last round is and odd round then human wins, if even then computer wins
			// the program display round number before update as the first round is named round 0, but in fact it is the first round.
			
			if (round % 2 == 1) {  
			    System.out.println("Human wins"); 
			}
			else {
				System.out.println("Computer wins");
			}
		}
		
		// computer first, same logic with previous condition just reverse the order of operation
		if (whoStart == 2) {
			System.out.println("Computer starts ");	
			int round = 0;  //round counter 
			int numStick = startStick;
			while (numStick > 0) {
				int Cmove = 0;
				while (Cmove < 1 || Cmove > numStick) {
					Cmove =  (Math.random() <= 0.5) ? 1 : 2 ;
				}
				System.out.println("Round " + round + ", " + numStick + " sticks at start, computer took " + Cmove + ", so " + (numStick - Cmove) + " sticks remain");
				numStick = numStick - Cmove;
				round ++;
				if (numStick <= 0) {break;}
				int Hmove = 0;
				while(Hmove > 2 || Hmove <1 || Hmove > numStick) {
					Hmove = ap.nextInt("Move one or two sticks (smaller than remaining sticks) ?");
				}
				System.out.println("Round " + round + ", " + numStick + " sticks at start, human took " + Hmove + ", so " + (numStick - Hmove) + " sticks remain");
				numStick = numStick - Hmove;
				round ++;	
			}
			if (round % 2 == 0) {  
			    System.out.println("Human wins");
			}
			else {
				System.out.println("Computer wins");
			}
		}
		
		//finish
		
		
		}
	
	}
