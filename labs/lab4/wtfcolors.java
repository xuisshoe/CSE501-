package lab4;
import cse131.ArgsProcessor; // import for prompt the input
import sedgewick.*; 	// imnport for draw objects

public class wtfcolors {
	public static void main(String[] args) {
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int ite = ap .nextInt(" Enter the numbers of iterations: ");
		
		//set the original position
		double x = Math.random();
		double y = Math.random();
		double radius = 0.05;
		double speedscale = 0.05;
		//set the original velocity
		double vx = speedscale*Math.random();
		double vy = speedscale*Math.random();
		
		for (int i = 0; i < ite; i++) {
			//clear the old image
			StdDraw.clear();
			//set the background color gray
			StdDraw.setPenColor(StdDraw.GRAY);
			StdDraw.filledSquare(0.5, 0.5, 1.0);
			//bounce off wall according to x and y position
			if ((x + vx) > (1.0 - radius/5) || (x + vx)< radius/5 ) {
				vx = -vx;
			}
			if ((y + vy) > (1.0 - radius/5) || (y + vy)< radius/5 ) {
				vy = -vy;
			}
			// update position 
			x = x + vx;
			y = y + vy;
			//draw the updated point
			StdDraw.setPenColor(StdDraw.BOOK_BLUE);
			StdDraw.setPenRadius(radius);
			StdDraw.point(x,y);
			
			StdDraw.show(15); 
			
		}
	}

}
