package exam12017;
import cse131.ArgsProcessor;
public class multipleof7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How many number you want to comoute ?");
		int sieve[] = new int[N];
		for (int i = 0; i<N; i++) {
			sieve[i] = i;
//	     
		}
		for (int i = 0; i < N; i++) {
			if(i>0 && (i+1)%7 == 0) {
				sieve[i] = 0;
				sieve[i+2] = 0;
				sieve[i+1] = 0;
			}
			if (sieve[i]!=0) {
				System.out.print(sieve[i] + ", ");
			}	
		}
	

	}

}
