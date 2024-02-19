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
import java.text.DecimalFormat;
import java.io.*;







public class CreateTranscriptDemo {

	

	private static int courseHours;
	private static String letterGrade;
	private static String courseNumber;
    private static PrintWriter writer;
    private static String fileName;


	public static void main(String[] args)  throws IOException {
		
		char yesOrNoEntry;
		int entryNumber = 1;
		String enterCourseNo = courseNumber;
		int enterCourseHr = courseHours;
		String enterLetterGr = letterGrade;
		
		Scanner keyboard = new Scanner(System.in);
		
		ArrayList<String> courseNumberArray = new ArrayList<String>();
		ArrayList<Integer> courseHoursArray = new ArrayList<Integer>();
		ArrayList<String> letterGradeArray = new ArrayList<String>();
		ArrayList<Double> numberGradeArray = new ArrayList<Double>();
		ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>();

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



			CreateTranscript transcript = new CreateTranscript(courseNumber, courseHours, letterGrade);
			transcript.setLetterGrade(letterGrade);
			numberGradeArray.add(transcript.getNumberGrade());
			double pointScale = transcript.getNumberGrade();
			pointScaleTimesCreditHoursArray.add(pointScale * courseHours);
			



			
			entryNumber++; 
			System.out.print("Do you have additional course details to enter? (Y/N): ");
			yesOrNoEntry = keyboard.next().charAt(0);
			keyboard.nextLine();
		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y'); 
		
do {
		System.out.println(courseNumberArray);
		System.out.println(courseHoursArray);
		System.out.println(letterGradeArray);
		System.out.println(numberGradeArray);
		
		

		CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr);
		double gradePoAv = transcript.getGradePointAverage(pointScaleTimesCreditHoursArray, courseHoursArray);
		DecimalFormat formatDouble = new DecimalFormat("0.00");
        System.out.println("Grade Point Average: " + formatDouble.format(gradePoAv) );
        
        System.out.print("Would you like to printout of your transcript? (Y/N): ");
		yesOrNoEntry = keyboard.next().charAt(0);
		keyboard.nextLine();
		if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
		    System.out.print("Please enter the file name where you would like to print your transcript: ");
		    fileName = keyboard.nextLine();
		    FileWriter fw = new FileWriter(fileName, true);
		    PrintWriter writer = new PrintWriter(fw);

		    int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
		            Math.max(letterGradeArray.size(), numberGradeArray.size()));
		    writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");
		    for (int i = 0; i < maxSize; i++) {
		        writer.print((i < courseNumberArray.size()) ? courseNumberArray.get(i) : "");
		        writer.print("\t\t\t\t");
		        writer.print((i < courseHoursArray.size()) ? courseHoursArray.get(i) : "");
		        writer.print("\t\t\t\t");
		        writer.print((i < letterGradeArray.size()) ? letterGradeArray.get(i) : "");
		        writer.print("\t\t\t\t");
		        writer.println((i < numberGradeArray.size()) ? numberGradeArray.get(i) : "");
		    }
		    writer.println("Grade Point Average: " + gradePoAv);

		    // Close and flush the PrintWriter
		    writer.close();
		    fw.close();

		    System.out.println("Data has been written to " + fileName + " successfully.");
		}


}  while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y');

        

        

	}

	
}
// D:\GitHub\MIS76810032024Sprg\media\text\transcript.txt
// D:\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv\mis\kly\w3\transcript.txt
//keyboard.close(); 
/*  // writer = new PrintWriter(fw);

			writer = new PrintWriter(new FileWriter(fileName, true);
			
 = null
		if (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y') {
			 PrintWriter writer = new PrintWriter(new File("transcript.txt"));

	            // Determine the maximum size of any ArrayList
	            int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
	                                   Math.max(letterGradeArray.size(), numberGradeArray.size()));

	            // Write column headers
	            writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");

	            // Write data
	            for (int i = 0; i < maxSize; i++) {
	                writer.print((i < courseNumberArray.size()) ? courseNumberArray.get(i) : "");
	                writer.print("\t\t");
	                writer.print((i < courseHoursArray.size()) ? courseHoursArray.get(i) : "");
	                writer.print("\t\t");
	                writer.print((i < letterGradeArray.size()) ? letterGradeArray.get(i) : "");
	                writer.print("\t\t");
	                writer.println((i < numberGradeArray.size()) ? numberGradeArray.get(i) : "");
	        
	    }

*/
/*
 * 
 * 
 * 
 * 
 */
//	private static PrintWriter writer;	
	 // PrintWriter writer = null;
//              break;      Continue with any other logic you need inside the loop
// Exit the loop
//PrintWriter writer = new PrintWriter(new File("transcript.txt")) { 
//	int maxSize = Math.max(Math.max(courseNumberArray.size(), courseHoursArray.size()),
//            Math.max(letterGradeArray.size(), numberGradeArray.size()));
//	writer.println("Course Number\tCredit Hours\tLetter Grade\tNumber Grade");
//}


// formatDouble.format(gradePoAv) 
//CreateTranscript transcript = new CreateTranscript(enterCourseNo, enterCourseHr, enterLetterGr);
//transcript.setLetterGrade(letterGrade);
//numberGradeArray.add(transcript.getNumberGrade());
//double pointScale = transcript.getNumberGrade();
//pointScaleTimesCreditHoursArray.add(pointScale*enterCourseHr);


// I don't really even understand math, so I'm going to have to do it this way.
// new CreateTranscript();
//		double grPoiAve = transcript.getGradePointAverage(pointScaleTimesCreditHoursArray, courseHoursArray);
// 			System.out.println("Grade Point Average: " + grPoiAve );
// ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>(); // I don't really even understand math, so I'm going to have to do it this way.
// pointScaleTimesCreditHours.add // I'm running out of time 
// anyway, it looks like the arrays are working // remove when program is finished
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
