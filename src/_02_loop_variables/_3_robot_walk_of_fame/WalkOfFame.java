
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot rob = new Robot("mini");
		rob.setSpeed(100);
		rob.penDown();
		int x = 100;
		
		for(int y = 0; y < 5; y++) {
		
		// 1. Set the X position of the robot so that it starts on the left.
	
			rob.moveTo(x, 300);
			//x = x + 50;
			//System.out.println("x: " + x);
			
		// You also need to show the robot to see the result of this line.
		
			for(int i = 0; i < 6; i++) {
		// 2. Make the robot draw a star shape. Hint: angle=144.
				rob.turn(144);
		// 3. Set the length of each line in the star to 30.
				rob.move(30);
			}
			
			
			
			x = x + 50;
			
		}

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
