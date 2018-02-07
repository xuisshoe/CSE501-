package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.point(0.5,0.5);
		// larger green point
		StdDraw.setPenColor(Color.GREEN);	
		StdDraw.setPenRadius(.05);
		StdDraw.point(.25, .5);
		// unfilled red triangle
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius();
		StdDraw.line(0, 0, 0, 1);
		StdDraw.line(0, 1, 0.5 ,0);
		StdDraw.line(0.5, 0, 0, 0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(0.75, 0.75, 0.1);
		// filled blue rectangle
		StdDraw.setPenColor( new Color(0,0,155));
		StdDraw.filledRectangle(0.75, 0.25, 0.03, 0.07);
		


	}

}
