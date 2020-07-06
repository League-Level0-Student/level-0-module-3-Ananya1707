package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		String happy = JOptionPane.showInputDialog("Are you happy?");
		
		if(happy.equalsIgnoreCase("Yes")){
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
		}
		
		else if(happy.equalsIgnoreCase("No")) {
			String wantHappiness = JOptionPane.showInputDialog("Do you want to be happy?");
			
			if(wantHappiness.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Change somthing.");
			}
			else if(wantHappiness.equalsIgnoreCase("No")) {
				JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");	
			}

			}

		}

	}

