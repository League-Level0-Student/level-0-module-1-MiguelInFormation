package ifs_ints_and_loops;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {
int score=0;

JOptionPane.showMessageDialog(null,"What has hands but can not clap?");
String answer = JOptionPane.showInputDialog("What is your answer");
if(answer.equals("a clock")) {
	JOptionPane.showMessageDialog(null, "CORRECT");
	JOptionPane.showMessageDialog(null,"Your score is...");
JOptionPane.showMessageDialog(null,score=2);




	}else {
	JOptionPane.showMessageDialog(null, "WRONG.");
	JOptionPane.showMessageDialog(null, "You get deducted.....");
	JOptionPane.showMessageDialog(null,score-2);
	JOptionPane.showMessageDialog(null,"Your score is...");
JOptionPane.showMessageDialog(null,score=-2);}

JOptionPane.showMessageDialog(null,"What is responsible for your voice in your respirtatory system?");
String answer2 = JOptionPane.showInputDialog("What is your answer");
if(answer2.equals("your larynx")){
	JOptionPane.showMessageDialog(null, "CORRECT");
	JOptionPane.showMessageDialog(null,"Your score is...");
JOptionPane.showMessageDialog(null,score=5);




	}else {
	JOptionPane.showMessageDialog(null, "WRONG.");
	JOptionPane.showMessageDialog(null, "You get deducted.....");
	JOptionPane.showMessageDialog(null,score-59);
	JOptionPane.showMessageDialog(null,"Your score is...");
JOptionPane.showMessageDialog(null,score);




}
		
		
		// 1. Make a variable to hold the score

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles

		// 4. If they got the answer right, pop up "correct!" and increase the score by one

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}


