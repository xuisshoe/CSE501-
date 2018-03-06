package exam12017;
import cse131.ArgsProcessor;
public class sorting {

	public static void main(String[] args) {
		
		

		

			
				ArgsProcessor ap = new ArgsProcessor(args);
				int n = ap.nextInt("enter the number of reducers: ");
				String letter = ap.nextString("enter the number you want to sort");
				int increment = ('z'-'a')/n;
				int part = 0;
				for (int i = 'a'; i < 'z'; i = i + increment) {
					int init = letter.charAt(0);
					if (init > (i + increment) & init>=i) {
						System.out.println(part);
					}
					part = part + 1;
				}

			}
}






