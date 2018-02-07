package exercises4;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {
			// do nothing but wait 
			StdDraw.pause(100);
			}
		// here, the mouse has been pressed
		System.out.println("Got the press!");
		
		// wait for the mouse to release
		while(StdDraw.mousePressed()) {
			// do nothing but wait
			StdDraw.pause(100);
		}
		// here the mouse is released
		System.out.println("Got the release");
		
		// draw a point at the location of the mouse
		
		double x = StdDraw.mouseX();
		double y = StdDraw.mouseY();
		StdDraw.setPenRadius(.02);
		StdDraw.point(x, y);
		// creat a string to store key value
		char getKey = ' ';
		// continous check if q has been presed
		while (getKey != 'q') {
			StdDraw.pause(100);
			if (StdDraw.hasNextKeyTyped()) {
				getKey = StdDraw.nextKeyTyped();
			}
			
		}
		// here, a q has been typed
		
		
		StdDraw.text(0.5, 0.5, "Farewell!");

	}

}
