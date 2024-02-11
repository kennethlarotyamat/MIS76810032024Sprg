package edu.unlv.mis768.kly;

import java.util.Scanner;

public class ConvertToMinutes {

	public static void main(String[] args) {
		// variable declaration // TODO Auto-generated method stub
		//int hours; // user input - entered by user - user defined
		//int minutes;// user input - entered by user - user defined
		//int convertedMinutes; // result to be calculated
		//Scanner kb = new Scanner(System.in); // I have to remember to import the scanner // the was one other thing we learned to import, but I forgot what that was // 
		
		//System.out.print("Please enter the number of hours: ");
		//hours = kb.nextInt();
		//System.out.print("Please enter the number of minutes: ");
		//minutes = kb.nextInt();
		
		//convertedMinutes = convertToMinutes(hours, minutes);
		
		//System.out.println(hours+" hour(s) and "+minutes+" minute(s) is "+convertedMinutes+" minute(s).");
        
		/**
		 * the above code has been commented out 
		 * and a new set of code will be written to test the 
		 * convertToMinutes code below
		 * 
		
		 */
		Scanner kb = new Scanner(System.in); // this had to be reintroduced because i accidentally commented it out above
		
		System.out.println ("Testing Started");
		System.out.println (" "); // to create a line break
		
		System.out.println ("0:0, expecting 0, get "+convertToMinutes(0,0));
		System.out.println ("0:0, expecting 1, get "+convertToMinutes(0,1));
		System.out.println ("0:0, expecting 99, get "+convertToMinutes(0,99));
		System.out.println ("0:0, expecting 60, get "+convertToMinutes(1,0));
		System.out.println ("0:0, expecting 300, get "+convertToMinutes(5,0));
		System.out.println ("0:0, expecting 150, get "+convertToMinutes(2,30));
		System.out.println (" "); // to create a line break
		System.out.println ("Testing Completed");
		
		kb.close();
		

	}
	public static int convertToMinutes (int hr, int min) {
		// result variable and calculation
		int result = 60*hr+min;
		return result; // testing an invalid result // return min; // return result;
		
	}

} 
// it works. as simple as this is, I'm actually really excited about it.
// i need to work today, and this is the last day to turn in the assignment to calculating average grades
// i didn't realize that the course grade has weights for different assignment classes.
/*

public static int convertToMinutes(int hr, int min) {
//result variable and calculation
 
 int result = 60*hr + min;
 return result;
 
 
 public static void displayMessage () {
 
 System.out.println("Hello");
 }
 
 what does return type void mean
 static 
 
 private static double calcTrainingRate(int age, int restingRate) {
 // user the formula to calculate the target training heart rate
 return 0.6 *(220-age)+restingRate;
 }
 
 
 */