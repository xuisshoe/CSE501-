package lab6;
import java.awt.Color;

import sedgewick.StdDraw;

public class triangle {
	/**
	 * This method draws the triangle 
	 * @param lx is the left most point's x coordinate 
	 * @param ly is the left most point's y coordinate 
	 * @param h is the height of the current triangle 
	 * @param a is the length of the triangle
	 */
	public static void tri(double lx, double ly, double h, double a) {
		// base case, stop when the size is sufficiently small
		if (h < .05) {
			return;  // abandon recursion
		}
		// draw the white triangle 
		StdDraw.setPenColor(Color.white);
		double x[] = {lx, lx+a/2, lx+a};
		double y[] = {ly, ly-h, ly};
		StdDraw.filledPolygon(x, y);
		//draw the upper triangle
		double x1[] = {lx + a/4, (lx + a/4) + a/4, (lx + a/4) + a/2};
		double y1[] = {ly + h/2, (ly + h/2) - h/2, ly + h/2};
		StdDraw.filledPolygon(x1, y1);
		// draw the left triangle 
		double x2[] = {lx - a/4, (lx - a/4) + a/4, (lx - a/4) + a/2};
		double y2[] = {ly - h/2, ly - h/2 - h/2, ly - h/2};
		StdDraw.filledPolygon(x2, y2);
		// draw the left triangle 
		double x3[] = {lx + a * 3/4, (lx + a * 3/4) + a/4, (lx + a * 3/4) + a/2};
		double y3[] = {ly - h/2, ly - h/2 - h/2, ly - h/2};
		StdDraw.filledPolygon(x3, y3);
		// pause to slow down the drawing action 
		//StdDraw.pause(500);
		
		//recursion to draw partition triangle 
		tri(lx + a/4, ly + h/2, h/2, a/2);// upper
		tri(lx - a/4, ly - h/2, h/2, a/2); // left
		tri(lx + a * 3/4, ly - h/2, h/2, a/2); // right	
	}

	public static void main(String[] args) {
		// Draw the black triangle background 
		StdDraw.setPenColor(Color.black);
		double x[] = {0, 0.5, 1};
		double y[] = {0, 1, 0};
		StdDraw.filledPolygon(x, y);
		// call method to draw recursive triangle 
		tri(0.25, 0.5, 0.5, 0.5);
		// print a word indicating the end of the drawing method
		System.out.println("Finish");
	}

}
