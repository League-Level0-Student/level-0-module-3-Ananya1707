
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		
		// 1. Call the method below to play the sound
		playMisterZee();
		// 2. Ask the user how many shiny objects they want
		String shinyObjects = JOptionPane.showInputDialog("How many shiny objects do you want?");
		int shinyObjectsAsInt = Integer.parseInt(shinyObjects);

		// 3. Play the sound that many times
		for(int i = 0; i < shinyObjectsAsInt; i++) {
			playMisterZee();
		}



	}

	/********************   Use this method. DON'T CHANGE THE CODE BELOW  ***********************/
	
	public static void playMisterZee() {
		try {
			System.out.println("it works or it does not work, that is the question");
			AudioClip sound = JApplet.newAudioClip(ShinyObjects.class.getResource("shiny-objects.wav"));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}


}
