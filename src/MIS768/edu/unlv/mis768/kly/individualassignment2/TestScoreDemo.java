package edu.unlv.mis768.kly.individualassignment2;

import javax.swing.JOptionPane; 


public class TestScoreDemo {



	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
		String enterQuestionQty;
		String enterQuestionMissedQty;

 
		
		enterQuestionQty = JOptionPane.showInputDialog("Please enter the number of test questions on the exam # " + (i + 1));
		
		

		enterQuestionMissedQty = JOptionPane.showInputDialog("Please enter the number of missed questions on the exam # " + (i + 1));
		
		
		
		TestScore examPrintout = new TestScore (enterQuestionQty,enterQuestionMissedQty);
		
		Double calculateQuestionValue = examPrintout.getPointsEach();
		Double calculateExamScore = examPrintout.getScore();
		
		
		System.out.println("These are the details for Exam # " + (i + 1));
		System.out.println("");
		System.out.println("Please enter the number of test questions on the exam # " + (i + 1) +" : " + enterQuestionQty);
		System.out.println("Please enter the number of missed questions on the exam # " + (i + 1) +" : " + enterQuestionMissedQty);
		
		System.out.println("");
		System.out.println(examPrintout.toString());
		System.out.println("");
		System.out.println("==============================================================");
		System.out.println("");
		

		
		

	}
	}
}
// Please enter the number of test questions on the exam # 2 : 14
// ==============================================================

//System.out.println("");
// okay, at some point it broke, but I realize how I broke it, i thought
// that i could remove these two things 
// Double calculateQuestionValue = firstExam.getPointsEach();
// and 
// Double calculateExamScore = firstExam.getScore();
// because eclipse says that I'm not using them, but I actually am using them.


