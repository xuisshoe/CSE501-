package emote;


public class Emote {
	
	private int happiness; // scale of -100 to 100
	private int surprise; // scale of 0 to 100
	
	/**
	 * Creates an Emote of the specified width and height
	 * @param width
	 * @param height
	 */
	public Emote(double width, double height) {
		this(0.5, 0.5, width, height);
	}
	
	/**
	 * Creates an Emote with default width and height
	 */
	public Emote() {
		this(0.5, 0.5, 0.75, 0.75);
	}
	
	/**
	 * Create Emerson the Emote (using StdDraw default coordinates)
	 * @param xCenter x coordinate of the center of the drawing
	 * @param yCenter y coordinate of the center of the drawing
	 * @param width width of the drawing
	 * @param height height of the drawing
	 */
	public Emote(double xCenter, double yCenter, double width, double height) {
		this.happiness = 0;
		this.surprise = 0;
	}
	
	
	/**
	 * Returns the current value of the happiness slider
	 * @return
	 */
	public int getHappiness() {
		return this.happiness;	
	}
	
	public int getSurprise() {
		return this.surprise;
	}
	

	
	/**
	 * Changes the happiness to the percent value passed in
	 * @param newValue
	 */
	public void setHappiness(int newValue){

		// Remove this line and complete this method
		System.out.println("Setting happiness to " + newValue);

	}
	
	
	/**
	 * Changes the surprise level to the percent value passed in 
	 * @param newValue
	 */
	public void setSurprise(int newValue) {
		
		// Remove this line and complete this method
		System.out.println("Setting surprise to " + newValue);
		
	}
	
	
	public void adjustSurprise(int delta) {
		this.setSurprise(this.getSurprise() + delta);
	}
	
	
	public void adjustHappiness(int delta) {
		this.setHappiness(this.getHappiness() + delta);
	}

	
	/**
	 * Calls upon each of the features of the face to change themselves based
	 * on the values of the 'happiness' and 'surprised' sliders
	 */
	public void updateFeatures(){
		// replace the following line with
		// code to update the drawing based on the current
		//   values of surprise and happiness
	}
	
}


