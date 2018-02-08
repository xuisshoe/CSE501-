package studio4;

import java.awt.Color;

import sedgewick.StdDraw;

public class Flag {

	public static void main(String[] args) {
		// drwa the flag first
		StdDraw.setScale(0, 1);
		StdDraw.setPenColor(Color.GREEN);
		// StdDraw.setPenRadius(0.05);
		// StdDraw.point(0, 0);
		double t = 1.0 / 6.0;
		StdDraw.filledRectangle(t, 0.5, t, .3);
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(5 * t, 0.5, t, .3);
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.3);
//		double x = 0;
//		double y = 0;
		for (double x = 0.1; x < 1; x += 0.2) {
			double y = 0.6 - x * (0.3);
			StdDraw.text(x, y, "ITALY");
			StdDraw.show(1000);
		}

	}

}
