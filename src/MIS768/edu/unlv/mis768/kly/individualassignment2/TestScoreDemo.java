package edu.unlv.mis768.kly.individualassignment2;

import javax.swing.JOptionPane; 


public class TestScoreDemo {



	public static void main(String[] args) {

		String enterQuestionQty;
		String enterQuestionMissedQty;

 
		
		enterQuestionQty = JOptionPane.showInputDialog("Please enter the number of test questions on the first exam: ");
		
		

		enterQuestionMissedQty = JOptionPane.showInputDialog("Please enter the number of missed questions on the first exam: ");
		
		
		
		TestScore firstExam = new TestScore (enterQuestionQty,enterQuestionMissedQty);
		

		
		
		
		System.out.println(firstExam.toString());
		

		
		

	}

}



//Double calculateQuestionValue = firstExam.getPointsEach();
//Double calculateExamScore = firstExam.getScore();
// I can't even believe how long this is taking me.
// 		String calculateQuestionValue;
// ,calculateQuestionValue,calculateExamScore
// // enterQuestionQty //100;

//public double getPointsEach() {
//
//	questionValue = (double) numQuestions / 100;
//	return questionValue;
//}
// double calculateQuestionValue;
//double calculateExamScore;
// String calculateFirstExamScore;
//I might have to do this again using system in keyboard -- but I don't want to do that considering how long I've already taken just getting this far.
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
// TODO Auto-generated method stub
// SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance); // The constructor SavingsAccount(String, String) is undefined

// TestScore firstExam = new TestScore (enterQuestionQty);
//SavingsAccount myAccount = new SavingsAccount(monthlyInterestRate,startingBalance);
// 			private static 
//			Create a program to demonstrate this Test class.
//			In this program, ask the user to enter the number of questions 
//			for the first test, and also enter the number of questions missed 
//			in the first test. After showing the content of the object representing 
//			the first test, the program asks the user to enter the same information 
//			for the second test. The program then shows the content of the second Test 
//			object. Finally, the program should indicate whether the scores of the two 
//			tests are the same.

//
//if(compXYZ.equals(compABC))
//	System.out.print("same");
//else
//	System.out.print("not the same");
//
//}

// I still don't understand this whole - two different files kind of thing
// all I know is that I have to put some things in one file, and a bunch of
// other things in some other file.
// so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int
//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String