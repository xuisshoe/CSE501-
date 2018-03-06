package lab6;
import java.awt.Color;

import sedgewick.StdDraw;

public class triangle {
	/**
	 * 
	 */
	public static void tri(double lx, double ly, double h, double a) {
		// base case, stop when the size is sufficiently small
		if (h < .01) {
			return;  // abandon recursion
		}
		// draw one horizontal and one vertical line to quadrisect
		//  the square (divide into 4 portions). Your code goes
		//  below here:
		StdDraw.setPenColor(Color.white);
		double x[] = {lx, lx+a/2, lx+a};
		double y[] = {ly, ly-h, ly};
		StdDraw.filledPolygon(x, y);
		//recursion to draw partition triangle 
		tri(lx+a/4, ly+h/2, 0.5*h, 0.5*a);// upper
		tri(0.5*lx, 0.5*ly, 0.5*h, 0.5*a); // left
		tri(lx+a*3/4, 0.5*ly, 0.5*h, 0.5*a); // right
		
	}

	public static void main(String[] args) {
		StdDraw.setPenColor(Color.black);
		double x[] = {0, 0.5, 1};
		double y[] = {0, 1, 0};
		StdDraw.filledPolygon(x, y);
		tri(0.25, 0.5, 0.5, 0.5);
	}

}
