package edu.unlv.mis.kly.w3;

import java.util.Scanner;

public class IndividualAssignmentOne {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double BASE_FEE = 4.5;
		final double OVERWEIGHT_FEE = 7;
		final double WEIGHT_LIMIT = 20;
		
		double taxableIncome;
		double charge;
		
		Scanner kb = new Scanner(System.in);
		try {
			

		
		System.out.print("Please enter your taxable income: ");
		taxableIncome = kb.nextDouble();
		
		charge = taxableIncome * (taxableIncome<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
		
		System.out.print("The total tax due is: $" +charge);
	} 

	finally {
		kb.close();
	}

	}

}






/*

taxableIncome

    10% on taxable income from $0 to $11,000, plus
    12% on taxable income over $11,001 to $44,725, plus
    22% on taxable income over $44,726 to $95,375, plus
    24% on taxable income over $95,376 to $182,100, plus
    32% on taxable income over $182,101 to $231,250, plus
    35% on taxable income over $231,251 to $578,125, plus
    37% on taxable income over $578,126 or more
    
    

		final String CLASS_1 = "$15";
		final String CLASS_2 = "$15";
		final String CLASS_3 = "$25";
		final String CLASS_4 = "$35";
		final String OTHER = "Invalid";







	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double BASE_FEE = 4.5;
		final double OVERWEIGHT_FEE = 7;
		final double WEIGHT_LIMIT = 20;
		
		double weight;
		double charge;
		
		Scanner kb = new Scanner(System.in);
		try {
			

		
		System.out.print("Please enter the weight of the package:");
		weight = kb.nextDouble();
		
		charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
		
		System.out.print("The total charge is:$" +charge);
	} 

	finally {
		kb.close();
	}

	}
	
	
package com.chestnutandhazel.edu.unlv.mis768.labwork;

public class WageCalculatorP {

	public static void main(String[] args) {
		// constants
		
		final double BASE_PAY = 25;
		final double REGULAR_HOURS = 40;
		
		// declare variables
		double salary; // salary to be calculated
		double hours = 57;
		
		salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
		
		
		System.out.print("The Salary is $" + salary);

	}

}

Resources:

https://www.geeksforgeeks.org/java-math-class/

...

there was another assignment, a package weight assignment, and this also might be another approach that i can use. it's
something like a package weight calculator. or package weight pricing calculator.

...

I'm thinking that I should start off with something similar to the ticket class assignment

Resources:

https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

https://www.w3schools.com/java/java_math.asp

https://www.javatpoint.com/java-math

https://docs.oracle.com/javase/tutorial/java/concepts/

https://www.geeksforgeeks.org/java-math-class/


Availability and Response Time
I will be logging in to this course to answer questions and provide feedback twice a day Monday-Friday. I will not be answering questions over the weekends or on holidays. 

You can attend the Office Hours on Tuesdays and Thursdays from 12-2 pm: https://calendar.app.google/4o3svZoNqmAyi61cALinks to an external site..
If the regular office hours do not work for you, please feel free to email me to set up appointments.
Resources
How do I send a message to a user (including the instructor) in a course in the InboxLinks to an external site.?

...

Correction: Assignment 1 tax bracket
Han-Fen Hu (She/Her)
All Sections
No unread replies.No replies.
Hi All,

I would like to make a correct on Individual Assignment 1: the tax bracket for 35% should start with $231,251 (instead of $231,250).

I have updated the assignment sheet and the assignment page. Sorry about the error!

Once again, Individual Assignment 1 is due on February 4. Please feel free to reach out if you have any questions or need help with the assignment.

Han-fen

This announcement is closed for comments

...

Purpose
Declare variables and constants and use them in a program.
Design a decision structure to evaluate different conditions and execute different instructions accordingly.
Handle user input and show output/results properly.
Requirement
Please provide proper comments to document your code, including the following:
Author’s name
Purpose of the program
In-line comments for the statements, including the variable/constant declaration and initialization.
Please submit the .java file(s) that contains the program for solving the following question.
Write a program that computes the income tax for an individual. 
The program should ask the user to enter the amount of taxable income. If the user enters a negative number, the program should show an error message and end the program. 

The program then uses the tax bracket (as shown below) to calculate the tax amount:
    10% on taxable income from $0 to $11,000, plus
    12% on taxable income over $11,001 to $44,725, plus
    22% on taxable income over $44,726 to $95,375, plus
    24% on taxable income over $95,376 to $182,100, plus
    32% on taxable income over $182,101 to $231,250, plus
    35% on taxable income over $231,251 to $578,125, plus
    37% on taxable income over $578,126 or more

The program should display the total income and the total tax due.

Note: The income and tax amount should be rounded up to the next whole number. You can use Math.ceil(number) to get the round-up number.

...




 */