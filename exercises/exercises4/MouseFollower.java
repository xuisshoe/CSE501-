package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much info to store ?");
		
		double mouseX[] = new double[N];
		double mouseY[] = new double[N];
		int ite = 0;
		
		StdDraw.setPenColor(Color.BLUE);
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			mouseX[ite] = x;
			mouseY[ite] = y;
			ite = ite + 1;
			
			// reset once memoey is out of bond
			if (ite >= N) {
				ite = 0;
			}
			
			//int i = ite; // do not think it is necessary
			StdDraw.filledCircle(mouseX[ite], mouseY[ite], .05);
  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
