package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Once upon a time there were three little pigs. They all decided to move out and build their own house. Help the three little pigs build their houses");
		
		String firstPig = JOptionPane.showInputDialog("Should the first pig build the house out of straw, sticks, or bricks?");
		String secondPig = JOptionPane.showInputDialog("Should the second pig build the house out of straw, sticks, or bricks?");
		String thirdPig = JOptionPane.showInputDialog("Should the third pig build the house out of straw, sticks, or bricks?");
		
		int alive = 0;

		if(firstPig.equalsIgnoreCase("straw")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the first pig's house away");
		}
		else if(firstPig.equalsIgnoreCase("sticks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the first pigss house away");
		}
		else if(firstPig.equalsIgnoreCase("bricks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and couldn't blow the first pig's house away");
			alive += 1;
		}
		
		if(secondPig.equalsIgnoreCase("straw")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the second pig's house away");
		}
		else if(secondPig.equalsIgnoreCase("sticks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the second pig's house away");
		}
		else if(secondPig.equalsIgnoreCase("bricks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and couldn't blow the second pig's house away");
			alive += 1;
		}
		
		if(thirdPig.equalsIgnoreCase("straw")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the third pig's house away");
		}
		else if(thirdPig.equalsIgnoreCase("sticks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and blew the third pig's house away");
		}
		else if(thirdPig.equalsIgnoreCase("bricks")) {
			JOptionPane.showMessageDialog(null, "The wolf huffed and puffed and couldn't blow the third pig's house away");
			alive += 1;
		}
		
		JOptionPane.showMessageDialog(null, alive + " little  pigs lived happily ever after");
		
		
		

	}

}
