package lab4;
import cse131.ArgsProcessor; // import for prompt the input
import sedgewick.*; 	// imnport for draw objects

public class BumpingBalls {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int ite = ap .nextInt(" Enter the numbers of iterations: ");
		int n = ap.nextInt(" Enter the number of balls: ");
		double ball [][] = new double[n][4];
		double radius = 0.05;
		double speedscale = 0.05;
		int pause = 20;
		
		// store the value in ball array
		for (int i = 0; i<n; i++) {
			ball[i][0] = Math.random(); // each x
			ball[i][1] = Math.random(); // eahc y
			ball[i][2] = speedscale*Math.random(); // each vx
			ball[i][3] = speedscale*Math.random(); // eahc vy
		}

		for (int i = 0; i < ite; i++) {
			StdDraw.clear();
			//StdDraw.setPenColor(StdDraw.GRAY);
			//StdDraw.filledSquare(0.5, 0.5, 1.0);
			for (int j = 0; j < n; j++) {
				// update position 
				ball[j][0] = ball[j][0] + ball[j][2];  //  each x = x + vx
				ball[j][1] = ball[j][1] + ball[j][3];  // each y = y +vy
				// x-axis calculation
				if ((ball[j][0] + ball[j][2]) > (1.0 - radius/5) || (ball[j][0] + ball[j][2])< radius/5){
					ball[j][2] = -1*ball[j][2]; // reverse vx
				}
				// y-axis calculation
				if ((ball[j][1] + ball[j][3]) > (1.0 - radius/5) || (ball[j][1] + ball[j][3])< radius/5){
					ball[j][3] = -1*ball[j][3]; // reverse vy
				}
				for (int a = 0; a < n; a++) {
					for (int b = a + 1; b < n; b++) {
						//if d = sqrt( (xa-xb)^2+(ya-yb)^2 ) <= radius, collision happens
						if ( Math.sqrt( Math.pow(ball[a][0] - ball[b][0], 2) + Math.pow(ball[a][1] - ball[b][1], 2) ) <= radius) {
							// if two ball collide, change both x and y velocity 
							ball[a][2] = -1*ball[a][2]; 
							ball[a][3] = -1*ball[a][3];
							ball[b][2] = -1*ball[b][2];
							ball[b][3] = -1*ball[b][3];
						}
					}
				}
				//draw the updated point
				StdDraw.setPenColor(StdDraw.BOOK_BLUE);
				StdDraw.setPenRadius(radius);
				StdDraw.point(ball[j][0],ball[j][1]); // draw x and y
				
			}
			StdDraw.show(pause); 	
		}
	}

}
