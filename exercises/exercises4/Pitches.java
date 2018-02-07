package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {

		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A
		
		ArgsProcessor ap = new ArgsProcessor(args);
		int pitch = ap.nextInt("What pitch ? ");
		int pitch7 = pitch + 7;
		
		double freq = 440.0 * Math.pow(2, pitch/12.0);
		double freq7 = 440.0 * Math.pow(2, pitch7/12.0);
		System.out.println("For pitch" + pitch);
		System.out.println("  The frequency is " + freq);
		System.out.println("  Up a dinomic fifth " + freq7);
		double ratio = freq7/freq;
		System.out.println("The ratio is " + ratio);
		


	}

}
