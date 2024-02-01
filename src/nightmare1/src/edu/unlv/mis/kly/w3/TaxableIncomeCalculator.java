/*
 * Author's Name: 		    Kenneth Larot Yamat
 * Purpose of Program:      To calculate the amount of tax due based on a user-entered amount of taxable income
 * 						    given a tiered marginal income tax structure
 */

package edu.unlv.mis.kly.w3;

import java.util.Scanner;

public class TaxableIncomeCalculator {

    public static void main(String[] args) {

        final double TEN_PERCENT = 0.10;
        final double TWELVE_PERCENT = 0.12;
        final double TWENTY_TWO_PERCENT = 0.22;
        final double TWENTY_FOUR_PERCENT = 0.24;
        final double THIRTY_TWO_PERCENT = 0.32;
        final double THIRTY_FIVE_PERCENT = 0.35;
        final double THIRTY_SEVEN_PERCENT = 0.37;
        final double ONE_HUNDRED_PERCENT = 1.00;

        final double BRACKET_LIMIT_TEN = 11000;
        final double BRACKET_LIMIT_TWELVE = 44725;
        final double BRACKET_LIMIT_TWENTY_TWO = 95375;
        final double BRACKET_LIMIT_TWENTY_FOUR = 182100;
        final double BRACKET_LIMIT_THIRTY_TWO = 231250;
        final double BRACKET_LIMIT_THIRTY_FIVE = 578125;
        final double BRACKET_LIMIT_THIRTY_SEVEN = 578126;
        


        double taxableIncome;
        double taxDue;


        Scanner kb = new Scanner(System.in);
        try {

            System.out.print("Please enter your taxable income: ");
            taxableIncome = kb.nextDouble();

            if (taxableIncome < 0) {
                System.out.print("Negative taxable income cannot be processed.");
            } else {
                taxDue =
                        // start brackets
                                        (0 < taxableIncome && taxableIncome <= BRACKET_LIMIT_TEN)
                                        ? 
                                        taxableIncome * TEN_PERCENT
                        // end 10
                                        : (BRACKET_LIMIT_TEN < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWELVE)
                                        ? 
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT)
                        // end 12
                                        : (BRACKET_LIMIT_TWELVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_TWO)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT)

                        // end 22
                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) 
                                        
                        // end 24
                                        : (BRACKET_LIMIT_TWENTY_FOUR < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_TWO)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT)

                        // end 32
                                        : (BRACKET_LIMIT_THIRTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_FIVE)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT)
                        // end 35
                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome >= BRACKET_LIMIT_THIRTY_SEVEN)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_FIVE - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_FIVE) * THIRTY_SEVEN_PERCENT): ONE_HUNDRED_PERCENT;  
                        // end 37
                                                                                            // REPLACE THIS WHEN READY
                                                                                            // REMEMBER TO CHECK BRACKET CONDITIONAL BRACKET RANGES


                System.out.print("The total tax due is: $" + Math.ceil(taxDue));
            }

        }

        finally {
            kb.close();
        }

    }

}
/*


BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && 
I FIGURED SOMETHING OUT -- FOR THE FINAL TAX BRACKET CODE -- IT'S DIFFERENT THAN THE OTHER ONES --

                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_SEVEN)

: INVALID_INFORMATION
		final double INVALID_INFORMATION ;
I think that I'm done almost well with the tax brackets protion anyway.

                                        : (BRACKET_LIMIT_THIRTY_FIVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_SEVEN)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_FIVE - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_FIVE) * THIRTY_SEVEN_PERCENT)


                                        final double THIRTY_SEVEN_PERCENT = 0.37;


                                        : (BRACKET_LIMIT_THIRTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_THIRTY_FIVE)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((BRACKET_LIMIT_THIRTY_TWO - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_THIRTY_TWO) * THIRTY_FIVE_PERCENT)



                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_FOUR - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_FOUR) * THIRTY_TWO_PERCENT)




                                        BRACKET_LIMIT_TWENTY_FOUR

I renamed this - well i had to create a copy of the original file, and rename the copy to follow the naming conventions requirement of the assignment
I'm going to be working on this from the file, the renamed - the copied and renamed file. = TaxableIncomeCalculator rather than IndividualAssignmentOne

                                        : (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
                                        ?
                                        (BRACKET_LIMIT_TEN * TEN_PERCENT) + 
                                        ((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
                                        ((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
                                        ((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) 

//


Math.ceil(number) to get the round-up number.

: (BRACKET_LIMIT_TWENTY_TWO < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_FOUR)
?
(BRACKET_LIMIT_TEN * TEN_PERCENT) + 
((BRACKET_LIMIT_TWELVE - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
((BRACKET_LIMIT_TWENTY_TWO - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT) +
((taxableIncome - BRACKET_LIMIT_TWENTY_TWO) * TWENTY_FOUR_PERCENT) 










//      double negativeTaxableIncome; // I wont be using this
I had to use a spreadsheet to figure out what was wrong with my math

the issue was that the first 11000 was being double taxed at the 12 percent bracket



		92750		10% on taxable income from $0 to $11,000, plus		
				12% on taxable income over $11,001 to $44,725, plus		
				22% on taxable income over $44,726 to $95,375, plus		
						
						
						
						
						
		11000	0.1	1100		
		44725	0.12	5367		
		48025	0.22	10565.5		
						
				17032.5		
						
						
						
						


(BRACKET_LIMIT_TWELVE < taxableIncome && taxableIncome <= BRACKET_LIMIT_TWENTY_TWO)
?
(BRACKET_LIMIT_TEN * TEN_PERCENT) + 
((taxableIncome - BRACKET_LIMIT_TEN) * TWELVE_PERCENT) +
((taxableIncome - BRACKET_LIMIT_TWELVE) * TWENTY_TWO_PERCENT)

(taxableIncome <= BRACKET_LIMIT_TEN && taxableIncome > 0)                           
                        (taxableIncome <= BRACKET_LIMIT_TEN && taxableIncome > 0) 





(taxableIncome <= BRACKET_LIMIT_TWELVE && BRACKET_LIMIT_TEN < taxableIncome)
(BRACKET_LIMIT_TEN < taxableIncome  &&     taxableIncome <= BRACKET_LIMIT_TWELVE )











 */





// i need a ternary conditional operator for before the first tax bracket for
// negative numbers
// something like if taxable income is less than zero
// I'm making progress here. thank god!
// I have to convert this ternary conditional operators to if or else if or if
// else statements because
// I'm already confused about how to do the next ternary conditional operators
// in the chain.

/*
 * BRACKET_LIMIT_TEN <
 * taxDue = (taxableIncome <= BRACKET_LIMIT_TEN) ?
 * taxableIncome * TEN_PERCENT :
 * 
 * (taxableIncome <= BRACKET_LIMIT_TWELVE) ?
 * (BRACKET_LIMIT_TEN * TEN_PERCENT) + ((taxableIncome - BRACKET_LIMIT_TEN) *
 * TWELVE_PERCENT) :
 * 
 * // Add additional condition or expression here if needed
 * (BRACKET_LIMIT_TWELVE * TWELVE_PERCENT) + ((taxableIncome -
 * BRACKET_LIMIT_TWELVE) * ANOTHER_PERCENT);
 * 
 * 
 */
/*
 * 
 * taxDue = (taxableIncome <= BRACKET_LIMIT_TEN) ?
 * taxableIncome * TEN_PERCENT :
 * (BRACKET_LIMIT_TEN * TEN_PERCENT) + ((taxableIncome - BRACKET_LIMIT_TEN) *
 * TWELVE_PERCENT);
 * 
 * taxDue = taxableIncome * (taxableIncome <= BRACKET_LIMIT_TEN ? TEN_PERCENT :
 * (TWELVE_PERCENT - (11000 * TEN_PERCENT)));
 * 
 * 
 * 
 * final double BRACKET_LIMIT_TEN = 20;
 * //37% on taxable income over $578,126 or more
 * // 10% on taxable income from $0 to $11,000, plus
 * //12% on taxable income over $11,001 to $44,725, plus
 * //22% on taxable income over $44,726 to $95,375, plus
 * //24% on taxable income over $95,376 to $182,100, plus
 * //32% on taxable income over $182,101 to $231,250, plus
 * //35% on taxable income over $231,251 to $578,125, plus
 * 10% on taxable income from $0 to $11,000, plus
 * final double BRACKET_LIMIT_TEN = 20;
 * 12% on taxable income over $11,001 to $44,725, plus
 * final double BRACKET_LIMIT_TWELVE = 20;
 * 22% on taxable income over $44,726 to $95,375, plus
 * final double BRACKET_LIMIT_TWENTY_TWO = 20;
 * 24% on taxable income over $95,376 to $182,100, plus
 * final double BRACKET_LIMIT_TWENTY-FOUR = 20;
 * 32% on taxable income over $182,101 to $231,250, plus
 * final double BRACKET_LIMIT_THIRTY_TWO = 20;
 * 35% on taxable income over $231,251 to $578,125, plus
 * final double BRACKET_LIMIT_THIRTY_FIVE = 20;
 * 37% on taxable income over $578,126 or more 578126
 * final double BRACKET_LIMIT_THIRTY_SEVEN = 20;
 * 
 * taxDue
 * // 
 * 
 * TO1DO Auto- 
 * generated 
 * method  
 * stub
 * 
 * 
 * taxableIncome
 * 
 * 10% on taxable income from $0 to $11,000, plus 11000
 * final double BRACKET_LIMIT_TEN = 20;
 * 12% on taxable income over $11,001 to $44,725, plus 44725
 * final double BRACKET_LIMIT_TWELVE = 20;
 * 22% on taxable income over $44,726 to $95,375, plus 95375
 * final double BRACKET_LIMIT_TWENTY_TWO = 20;
 * 24% on taxable income over $95,376 to $182,100, plus 182100
 * final double BRACKET_LIMIT_TWENTY-FOUR = 20;
 * 32% on taxable income over $182,101 to $231,250, plus 231250
 * final double BRACKET_LIMIT_THIRTY_TWO = 20;
 * 35% on taxable income over $231,251 to $578,125, plus 578125
 * final double BRACKET_LIMIT_THIRTY_FIVE = 20;
 * 37% on taxable income over $578,126 or more
 * final double BRACKET_LIMIT_THIRTY_SEVEN = 20;
 * 
 * 
 * 
 * final String CLASS_1 = "$15";
 * final String CLASS_2 = "$15";
 * final String CLASS_3 = "$25";
 * final String CLASS_4 = "$35";
 * final String OTHER = "Invalid";
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * public static void main(String[] args) {
 * // TO1DO Auto-generated method stub
 * final double BASE_FEE = 4.5;
 * final double OVERWEIGHT_FEE = 7;
 * final double WEIGHT_LIMIT = 20;
 * 
 * double weight;
 * double charge;
 * 
 * Scanner kb = new Scanner(System.in);
 * try {
 * 
 * 
 * 
 * System.out.print("Please enter the weight of the package:");
 * weight = kb.nextDouble();
 * 
 * charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
 * 
 * System.out.print("The total charge is:$" +charge);
 * }
 * 
 * finally {
 * kb.close();
 * }
 * 
 * }
 * 
 * 
 * package com.chestnutandhazel.edu.unlv.mis768.labwork;
 * 
 * public class WageCalculatorP {
 * 
 * public static void main(String[] args) {
 * // constants
 * 
 * final double BASE_PAY = 25;
 * final double REGULAR_HOURS = 40;
 * 
 * // declare variables
 * double salary; // salary to be calculated
 * double hours = 57;
 * 
 * salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
 * 
 * 
 * System.out.print("The Salary is $" + salary);
 * 
 * }
 * 
 * }
 * 
 * Resources:
 * 
 * https://www.geeksforgeeks.org/java-math-class/
 * 
 * ...
 * 
 * there was another assignment, a package weight assignment, and this also
 * might be another approach that i can use. it's
 * something like a package weight calculator. or package weight pricing
 * calculator.
 * 
 * ...
 * 
 * I'm thinking that I should start off with something similar to the ticket
 * class assignment
 * 
 * Resources:
 * 
 * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
 * 
 * https://www.w3schools.com/java/java_math.asp
 * 
 * https://www.javatpoint.com/java-math
 * 
 * https://docs.oracle.com/javase/tutorial/java/concepts/
 * 
 * https://www.geeksforgeeks.org/java-math-class/
 * 
 * 
 * Availability and Response Time
 * I will be logging in to this course to answer questions and provide feedback
 * twice a day Monday-Friday. I will not be answering questions over the
 * weekends or on holidays.
 * 
 * You can attend the Office Hours on Tuesdays and Thursdays from 12-2 pm:
 * https://calendar.app.google/4o3svZoNqmAyi61cALinks to an external site..
 * If the regular office hours do not work for you, please feel free to email me
 * to set up appointments.
 * Resources
 * How do I send a message to a user (including the instructor) in a course in
 * the InboxLinks to an external site.?
 * 
 * ...
 * 
 * Correction: Assignment 1 tax bracket
 * Han-Fen Hu (She/Her)
 * All Sections
 * No unread replies.No replies.
 * Hi All,
 * 
 * I would like to make a correct on Individual Assignment 1: the tax bracket
 * for 35% should start with $231,251 (instead of $231,250).
 * 
 * I have updated the assignment sheet and the assignment page. Sorry about the
 * error!
 * 
 * Once again, Individual Assignment 1 is due on February 4. Please feel free to
 * reach out if you have any questions or need help with the assignment.
 * 
 * Han-fen
 * 
 * This announcement is closed for comments
 * 
 * ...
 * 
 * Purpose
 * Declare variables and constants and use them in a program.
 * Design a decision structure to evaluate different conditions and execute
 * different instructions accordingly.
 * Handle user input and show output/results properly.
 * Requirement
 * Please provide proper comments to document your code, including the
 * following:
 * Author’s name
 * Purpose of the program
 * In-line comments for the statements, including the variable/constant
 * declaration and initialization.
 * Please submit the .java file(s) that contains the program for solving the
 * following question.
 * Write a program that computes the income tax for an individual.
 * The program should ask the user to enter the amount of taxable income. If the
 * user enters a negative number, the program should show an error message and
 * end the program.
 * 
 * The program then uses the tax bracket (as shown below) to calculate the tax
 * amount:
 * 10% on taxable income from $0 to $11,000, plus
 * 12% on taxable income over $11,001 to $44,725, plus
 * 22% on taxable income over $44,726 to $95,375, plus
 * 24% on taxable income over $95,376 to $182,100, plus
 * 32% on taxable income over $182,101 to $231,250, plus
 * 35% on taxable income over $231,251 to $578,125, plus
 * 37% on taxable income over $578,126 or more
 * 
 * The program should display the total income and the total tax due.
 * 
 * Note: The income and tax amount should be rounded up to the next whole
 * number. You can use Math.ceil(number) to get the round-up number.
 * 
 * ...
 * 
 * 
 * 
 * 
 */