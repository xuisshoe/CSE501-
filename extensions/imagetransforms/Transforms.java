package imagetransforms;

import java.awt.Color;

import sedgewick.Picture;


public class Transforms {
	
	/**
	 * This one is solved for you.
	 * @param source
	 * @param target
	 */
	public static void flipHoriz(Picture source, Picture target) { 
		for (int x = 0; x < source.width(); x++) {
			for (int y = 0; y < source.height(); y++) {
				//
				// Convince yourself that otherX is the x coordinate flipped,
				//     on the other side of the image by doing the following:
				// Check that this is true when x == 0
				//      then otherX = source.width() - 1
				//      which is indeed the rightmost pixel
				// Check that this is true when x == source.width()-1
				//      then otherX = 0
				//      which is indeed the leftmost pixel
				//
				int otherX = source.width() - 1 - x;  // otherX is the mirror of x
				Color c = source.get(otherX, y);      // get the Color at the mirror point of the source
				target.set(x, y, c);                  // and set it at x,y in the target
			}
		}
	}
	
	public static void flipVert(Picture source, Picture target) {
		// flip the picture upside down 
		for (int y = 0; y < source.height(); y++) {
			for (int x = 0; x < source.width(); x++) {
				int otherY = source.height() - 1 - y; //find the corresponding mirror point for y
				Color c = source.get(x , otherY); // read the color of the mirror y 
				target.set(x, y, c);//assign the color of the mirror y to the target y 
				// loop through the full height of the picture 
			}
		}
		
	}
	
	
	public static void flipHorizLeftHalf(Picture source, Picture target) {
		// FIXME
		for (int x = 0; x <= source.width()/2; x++ ){
			for(int y = 0; y < source.height(); y++) {
				Color c = source.get(x, y);
				target.set(x, y, c);
			}
		}
		for (int x = source.width()/2 + 1; x > source.width()/2 && x < source.width(); x++) {
			for(int y = 0; y < source.height(); y++) {
				int otherX = (source.width()-1)/2 - (x - (source.width()-1)/2);
				Color c = source.get(otherX, y);
				target.set(x, y, c);
			}
		}
	}
	
	public static void flipVertBotHalf(Picture source, Picture target) {
		// copy the top half of the original picture
		for(int y = 0; y <= source.height()/2; y++) {
			for(int x = 0; x < source.width(); x++) {
				Color c = source.get(x, y);
				target.set(x, y, c);
			}
		}
		// flip the top half and place it at bottom
		for (int y = source.height()/2 + 1 ; y < source.height(); y++) {
			for (int x = 0; x < source.width(); x++) {
				int upperY = source.height()/2 - ( y - source.height()/2 );
				Color c = source.get(x, upperY);
				target.set(x, y, c);
			}
		}
		
	}
	
	public static void gradient(Picture target) {
		for(int x = 0; x < target.width(); x++) {
			for(int y = 0; y < target.height(); y++) {
				// red is in proportion to the width, slope 255/width
				int redAmount = 255 * x / target.width(); //put 255*x together to guarantee nonzero value
				// green is in proportion to the height, slope 255/width. 
				int greenAmount = 255 * y / target.height(); //put 255*y together to guarantee nonzero value 
				target.set(x, y, new Color(redAmount, greenAmount, 128));
				//System.out.println(redAmount + "    " + greenAmount);
			}
		}
	}
	
	public static void edgeDetect(Picture source, Picture target) {
		// FIXME
	}
	
	public static void digitalFilter(Picture source, Picture target) {
		// FIXME	
	}



}
