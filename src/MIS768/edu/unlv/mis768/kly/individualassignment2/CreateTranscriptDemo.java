/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To create a student transcript file that includes courses
     								taken, with corresponding credit hour, letter grade, and 
     								grade point values for each course taken, and a grade point average
     								calculated and printed at the end of the file                          		
     						    	 
  		Date Due:					February 18th, 2024
*/

package edu.unlv.mis768.kly.individualassignment2;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;







public class CreateTranscriptDemo {



	public static void main(String[] args) {
		
		char yesOrNoEntry;
		int entryNumber = 1;
		
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> courseNumberArray = new ArrayList<String>();
		ArrayList<Integer> courseHoursArray = new ArrayList<Integer>();
		ArrayList<String> letterGradeArray = new ArrayList<String>();
		ArrayList<Double> numberGradeArray = new ArrayList<Double>();

		do {

			System.out.print("Enter a course number for entry # "+entryNumber+": "); 
			String courseNumber = keyboard.nextLine();
			courseNumberArray.add(courseNumber);
			
			System.out.print("Enter credit hours for entry # "+entryNumber+": "); 
			int courseHours = keyboard.nextInt();
			keyboard.nextLine();
			courseHoursArray.add(courseHours);
			
			System.out.print("Enter letter grade earned for entry # "+entryNumber+": "); 
			String letterGrade = keyboard.nextLine();
			letterGradeArray.add(letterGrade);

			String enterCourseNo = courseNumber;
			int enterCourseHr = courseHours;
			String enterLetterGr = letterGrade;

			
			CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr);
			transcript.setLetterGrade(letterGrade);
			numberGradeArray.add(transcript.getNumberGrade());

			
			entryNumber++; 
			System.out.print("Do you have additional course details to enter? (Y/N): ");
			yesOrNoEntry = keyboard.next().charAt(0);
			keyboard.nextLine();
		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y'); 
		
		// remove when program is finished
		System.out.println(courseNumberArray);
		System.out.println(courseHoursArray);
		System.out.println(letterGradeArray);
		System.out.println(numberGradeArray);
		

	}

}
// testing area // it's working
// testing area // it's working
//System.out.println(courseNumberArray);
//System.out.println(courseHoursArray);
//System.out.println(letterGradeArray);
//System.out.println(numberGradeArray);

//These are calculated and not entered, i am removing them  //			String enterNumberGr = null;
//String enterGrPointAve = null;


// , enterNumberGr, enterGrPointAve
//String courseHoursString = keyboard.nextLine();
//int courseHours = Integer.parseInt(courseHoursString);
// i selected the option to create a field, but i decided to create a local variable instead // private static String enterCourseNo;

// 
//	CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr, enterNumberGr, entherGrPointAve); 
// String courseNo, String courseHr, String letterGr, String numberGr, String grPointAve 		
//			TestScore examPrintout = new TestScore(enterQuestionQty, enterQuestionMissedQty);
//
//Double calculateQuestionValue = examPrintout.getPointsEach();
//Double calculateExamScore = examPrintout.getScore();
// (int i = 0; i < 2; i++)
// 		https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=44972106-8d10-4e61-af3d-accc0170d18e&start=0
//		ArrayList<Double> sequenceOfScores = new ArrayList<Double>();
//		ArrayList<Double> questionValueArray = new ArrayList<Double>(); 
// 		so I didn't really use two different arrays in the TestScoreDemo, 
//		I set it up just to remove the warning, but i didn't use the questionValueArray
//		private String courseNumber;

//		private int courseHours;

//		private String letterGrade;
//		private double numberGrade;
// ArrayList<String> expenseDescriptionArray = new ArrayList<String>();
//ArrayList<String> courseNumberArray = new ArrayList<String>();	//		private String courseNumber;
//ArrayList<int> courseHoursArray = new ArrayList<String>();	//		private int courseHours;
//ArrayList<String> letterGradeArray = new ArrayList<String>();	//		private String letterGrade;
//ArrayList<double> numberGradeArray = new ArrayList<String>();	//		private double numberGrade;
//import java.text.DecimalFormat; // I don't think that I'll need this on the Demo file
// as of 5 PM, I've managed to declare the authors name, the purpose of the program, and the due date

//You can choose to use the object-oriented or procedural approach in this assignment.

/*
 * 
given a tiered marginal income tax structure
based on a user-entered amount of taxable income
To calculate the amount of tax due
, the credit hour value of 

 * 
 */
//Author’s name
//		Please provide proper comments to document your code, including the following:
//		Author’s name
//		Purpose of the program
//		In-line comments for the statements, including the variable/constant declaration and initialization
//		Please submit the .java file(s) that contains the program for solving the following question.
//		You can choose to use the object-oriented or procedural approach in this assignment.
// 		import javax.swing.JOptionPane;
//		import java.util.Random;
//		import java.io.FileNotFoundException;
//		import java.io.IOException;
//		import java.io.File;
//
//		import java.util.Scanner;
//		import java.io.PrintWriter;
//		import java.io.*; // this is an alternative, which includes IOException and PrintWriter
//		import java.util.Scanner;
//		TO DO Auto-generated method stub
