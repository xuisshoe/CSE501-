package bankinterest;
import cse131.ArgsProcessor;

public class bankInterest {

	public static void main(String[] args) {
		// global variables
		double moneyStart = 4000.00;
		String type[] = new String[30];
		//double amount[] = new double[30];
		double balance[] = new double[31];
		balance [0] = moneyStart; //set initial value
		//print label
		System.out.println("Day  Type	 Amount	  Balance");
		// calculation and displaying result
		for(int i = 0; i < 30; i++) {
			double action = Math.random(); //generate random num
			// determine action
			if (action < 0.5) {
				double withdraw = 100.00;
				balance[i+1] = balance[i] - withdraw; // withdraw 100
				type[i] = "withdraw	$100.00";
			}else {
				double deposit = 200.50;
				balance[i+1] = balance[i] + deposit; //Deposit 200.50
				type[i] = "deposit	$200.50";
			}
			System.out.println( (i+1) + "   " + type[i] + "   " + balance[i+1] + "0");
		}
		System.out.println(" ");
		System.out.println("Interest earned: " + 0.01* Math.round(balance[30]*0.02*100) );
		System.out.println("Money after one month 's interest is: " + balance[30]*1.02);
	}

}
