package emote;

import sedgewick.StdDraw;
import java.awt.*;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.*;
import java.awt.event.*;
import java.util.Hashtable;



public class EmoteDemo extends JPanel implements ActionListener, ChangeListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 337108465457090494L;

	private Emote emote = new Emote();

	public EmoteDemo() {
	    this.setLayout(new GridLayout(1,2));

	    // add happiness slider
	    JSlider happinessSlider = new JSlider(JSlider.VERTICAL, -100, 100, 30);
	    add(happinessSlider);
        happinessSlider.addChangeListener(happinessListener);
        Hashtable<Integer, JLabel> happinessLabels = new Hashtable<Integer, JLabel>();
	    happinessLabels.put(0, new JLabel("Neutral"));
	    happinessLabels.put(100, new JLabel("Very Happy"));
	    happinessLabels.put(-100, new JLabel("Very Unhappy"));
        happinessSlider.setLabelTable(happinessLabels);
        happinessSlider.setPaintLabels(true);
        
        // add surprise slider
        JSlider surpriseSlider = new JSlider(JSlider.VERTICAL, 1, 100, 10);
        surpriseSlider.setPaintLabels(true);
        add(surpriseSlider);
        surpriseSlider.addChangeListener(surpriseListener);
        Hashtable<Integer, JLabel> surpriseLabels = new Hashtable<Integer, JLabel>();
        surpriseLabels.put(1, new JLabel("Surprised"));
        surpriseLabels.put(100, new JLabel("Very Surprised"));
        surpriseSlider.setLabelTable(surpriseLabels);
        surpriseSlider.setPaintLabels(true);
        
	}

	
	
	public static void main(String[] argv) {
		
		JFrame frame = new JFrame("Emote Controller");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setContentPane(new EmoteDemo());
	    frame.pack();
	    frame.setLocationRelativeTo(null); // centers the emote controller
	    frame.setVisible(true);
	    
		// set the scale of the coordinate system
//		StdDraw.setXscale(-1.0, 1.0);
//		StdDraw.setYscale(-1.0, 1.0);
		
		// create a new Emote
		Emote emote = new Emote();
		emote.updateFeatures();

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		JSlider source = (JSlider)e.getSource();
        if (!source.getValueIsAdjusting()) {

            } else {
            	emote.updateFeatures();
            	
            }
        }



	
	/**
	 * Set Emote's happiness to the value selected on the happiness slider
	 */
	ChangeListener happinessListener = new ChangeListener() {
		public void stateChanged(ChangeEvent e){
			JSlider source = (JSlider)e.getSource();
			if (!source.getValueIsAdjusting()) {

            } else {

            	int newValue = source.getValue();
            	emote.setHappiness(newValue);
            	emote.updateFeatures();

            }
			
		}
	};
	
	
	/**
	 * Set Emote's happiness level to 0 when neutral button is clicked
	 */
	ActionListener neutralListener = new ActionListener() {
		 public void actionPerformed(ActionEvent actionEvent) {
			 emote.setHappiness(0);
			 emote.updateFeatures();

		 }
	};
	
	
	/**
	 * Set Emote's surprise level to the value selected on the surprise slider
	 */
	ChangeListener surpriseListener = new ChangeListener() {
		public void stateChanged(ChangeEvent e){
			JSlider source = (JSlider)e.getSource();
			if (!source.getValueIsAdjusting()) {

            } else {
            	int newValue = source.getValue();
            	emote.setSurprise(newValue);
            	emote.updateFeatures();
            }
			
		}
	};

	@Override
	public void actionPerformed(ActionEvent e) {
        //Advance the animation frame.
		emote.updateFeatures();
	}

}
