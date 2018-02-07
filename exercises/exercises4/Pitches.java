package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {

		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int pitch1 = ap.nextInt("What is pitch one ? ");
		int pitch2 = ap.nextInt("What is pitch two ? ");
		//int pitch71 = pitch1 + 7;
		//int pitch72 = pitch2 + 7;
		
		double freq1 = 440.0 * Math.pow(2, pitch1/12.0);
		double freq2 = 440.0 * Math.pow(2, pitch2/12.0);
		
		//double freq71 = 440.0 * Math.pow(2, pitch71/12.0);
		//double freq72 = 440.0 * Math.pow(2, pitch72/12.0);
		
		System.out.println("For pitch one " + pitch1);
		System.out.println("  The frequency is " + freq1);
		//System.out.println("  Up a dinomic fifth " + freq71);
		//double ratio1 = freq71/freq1;
		//System.out.println("The ratio one is " + ratio1);
		
		System.out.println("For pitch two " + pitch2);
		System.out.println("  The frequency is " + freq2);
		//System.out.println("  Up a dinomic fifth " + freq72);
		//double ratio2 = freq72/freq2;
		//System.out.println("The ratio one is " + ratio2);
		
		double ratio = freq2/freq1;
		System.out.println("  Ratio is " + ratio);
		


	}

}
