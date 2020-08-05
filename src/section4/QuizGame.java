package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Score= (0);
		// 2.  Ask the user a question 
		String A1= JOptionPane.showInputDialog("What is 1+1?");
		// 3.  Use an if statement to check if their answer is correct
		if (A1.equals("2")) {
			JOptionPane.showMessageDialog(null, "Correct");
			Score+=1;
		}
		else JOptionPane.showMessageDialog(null, "Sorry, the answer was 2.");
		// 4.  if the user's answer was correct, add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		System.out.println(Score);
	}
}
