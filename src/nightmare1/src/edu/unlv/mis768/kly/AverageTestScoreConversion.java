package edu.unlv.mis768.kly;

import java.util.Scanner;

public class AverageTestScoreConversion {

	public static void main(String[] args) {
		int firstScore;
		int secondScore;
		int thirdScore;
		int enteredScores; 
																														//int hours; 																									// user input - entered by user - user defined
																														//int minutes;																								// user input - entered by user - user defined
																											
																													
		Scanner kb = new Scanner(System.in); 																		
		
		System.out.print("Enter score on Assignment 1: ");
		firstScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 2: ");
		secondScore = kb.nextInt();
		
		System.out.print("Enter score on Assignment 2: ");
		thirdScore = kb.nextInt();
		
		enteredScores = processedScores(firstScore, secondScore, thirdScore);											
		System.out.println("Your average score is: "+enteredScores);
		System.out.println("Your letter grade is: ");
		
        kb.close();
		

	}
	public static int processedScores (int scoreOne, int scoreTwo, int scoreThree) {
																																					
		double resultRoundedUp = Math.ceil((double)(scoreOne+scoreTwo+scoreThree)/3);									
		int result = (int) resultRoundedUp;
		return result;
		
	}
	
	public static String letterGrade () {
		
		String resultLetterGrade = 
				(0 <= enteredScores && enteredScores <= 69) ? "F"
		
				: (70 <= enteredScores && enteredScores <= 79) ? "C"
					
					: (80 <= enteredScores && enteredScores <= 89) ?"B"
		: (90 <= enteredScores && enteredScores <= 100) ?  "A" 
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
