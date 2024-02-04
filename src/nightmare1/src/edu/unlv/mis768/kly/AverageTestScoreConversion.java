package edu.unlv.mis768.kly;

import java.util.Scanner;

public class AverageTestScoreConversion {

	public static void main(String[] args) {
		int firstScore = 0;
		int secondScore = 0;
		int thirdScore = 0;
		int enteredScores;
		boolean invalidInformation = false;
		//boolean invalidInformation = false;
																														//int hours; 																									// user input - entered by user - user defined
// i really don't want to do any more input validation that I've already done. it throws out negative numbers, scores taht are negative numbers, and scores over 100
		//int minutes;																								// user input - entered by user - user defined
																											
																													
		Scanner kb = new Scanner(System.in); 
		
		//try {
		
		
		
		try {
		System.out.print("Enter score on Assignment 1: ");
		firstScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 2: ");
		secondScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 3: ");
		thirdScore = kb.nextInt();
		}
        catch (java.util.InputMismatchException e) {
            	// This causes any input other than a number to be classified as invalid information
            	invalidInformation = true;                    
        }
        finally{kb.close();}
        if (invalidInformation) {
            // this is active if a user enters non-numeric characters and informs the user that the information entered is not valid.
            System.out.println("There seems to be an error, please review inputs.");
        }
		
		
		// i can't believe it's finally done.
        // this was actually as time consuming as the tax due assignment
		
		//}
		// catch (java.util.InputMismatchException e) {
            // This causes any input other than a number to be classified as invalid information
       //     invalidInformation = true;                    
       // }
        //else {
		enteredScores = processedScores(firstScore, secondScore, thirdScore);											
		System.out.println(enteredScores == -1 || invalidInformation == true ?"There seems to be an error, please review inputs.":"Your average score is: "+enteredScores); 					// "There seems to be an error, please review inputs."
		System.out.println(enteredScores == -1 || invalidInformation == true ?"There seems to be an error, please review inputs.":"Your letter grade is: "+letterGrade(enteredScores));
		
        
       // }

	}
	public static int processedScores (int scoreOne, int scoreTwo, int scoreThree) {
																																					
		double resultRoundedUp = 
		Math.ceil((double)(scoreOne+scoreTwo+scoreThree)/3);									
		int result = (int) resultRoundedUp;
		return (result < 0 || result > 100 ) ? -1 : result;    											//  "There seems to be an error, please review inputs."  Integer.toString(result);  // (String) result; // what a headache Integer.toString  System.out.print("Negative taxable income cannot be processed.");
		
	}
	
	public static String letterGrade (int enteredScores) {
		
		String resultLetterGrade = 
		  (0 <= enteredScores && enteredScores <= 69)    ?  "F"

		: (70 <= enteredScores && enteredScores <= 79)   ?  "C"

		: (80 <= enteredScores && enteredScores <= 89)   ?  "B"
		: (90 <= enteredScores && enteredScores <= 100)  ?  "A" 
		: "There seems to be an error, please review inputs.";
		return resultLetterGrade;
		
	}
} 

/*
  
  
	public static String letterGrade () {
																																					
		double resultRoundedUp = Math.ceil((double)(scoreOne+scoreTwo+scoreThree)/3);									
		int result = (int) resultRoundedUp;
		return result;
		
	}

(0 <= enteredScores && enteredScores <= 69)
?F:
?C:(70 <= enteredScores && enteredScores <= 79)
?B:(80 <= enteredScores && enteredScores <= 89)
?A:(90 <= enteredScores && enteredScores <= 100):"There seems to be an error, please review inputs.";







(0 <= enteredScores && enteredScores <= 70)
(0 <= enteredScores && enteredScores <= 70)


(0 <= taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
                                        ? 
                                        taxableIncome * TEN_PERCENT
                                                                                : (BRACKET_LIMIT_TEN < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWELVE)
                                        ? 
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +                    // income taxable at 10%
                                        ((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT)



*/


//		(0 <= taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
//		? 
//		taxableIncome * TEN_PERCENT



//int convertedMinutes;
//result to be calculated

//I have to remember to import the scanner // the was one other thing we learned to import, but I forgot what that was // 


//convertedScores = convertToScores(hours, minutes);												//	convertedMinutes = convertToMinutes(hours, minutes);
//+ Math.ceil(taxDue));

//variable declaration // TODO Auto-generated method stub

//result variable and calculation
//60*hr+min;
// it works. as simple as this is, I'm actually really excited about it.
// i need to work today, and this is the last day to turn in the assignment to calculating average grades
// i didn't realize that the course grade has weights for different assignment classes.
