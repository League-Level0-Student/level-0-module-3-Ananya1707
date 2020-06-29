
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot robot = new Robot("mini");
		robot.penDown();
		robot.setSpeed(100);
		
		for (int i = 0; i < 10; i++) {
	    //2. Make the robot draw a shape (this will take more than one line of code)
		robot.move(30);
		robot.setAngle(90);
		robot.move(30);
		robot.setAngle(180);
		robot.move(30);
		robot.setAngle(270);
		robot.move(30);
		robot.setAngle(360);
		//3. Set the pen width to 10
		robot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String penColor = JOptionPane.showInputDialog("Pick a pen color.");
		//5. Use an if/else statement to set the pen color that the user requested
		if(penColor.equals("black")) {
			robot.setPenColor(0, 0, 0);
		}
		else if(penColor.equals("red")) {
			robot.setPenColor(255, 0, 0);
		}
		else if(penColor.equals("orange")) {
			robot.setPenColor(255, 165, 0);
		}
		else if(penColor.equals("yellow")) {
			robot.setPenColor(255, 225, 0);
		}
		else if(penColor.equals("green")) {
			robot.setPenColor(0, 128, 0);
		}
		else if(penColor.equals("blue")) {
			robot.setPenColor(0, 0, 225);
		}
		else if(penColor.equals("purple")) {
			robot.setPenColor(128, 0, 128);
		}
        //6. If the user doesn't enter anything, choose a random color
		else {
			robot.setRandomPenColor();
		}
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		}

		



	}
}
