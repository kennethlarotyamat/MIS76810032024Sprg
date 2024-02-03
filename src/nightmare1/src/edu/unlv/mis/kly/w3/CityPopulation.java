package edu.unlv.mis.kly.w3;

import java.util.Scanner;

public class CityPopulation {

	public static void main(String[] args) {
												// int number = 0;							// reintroduced to reduce squiggly lines in eclipse- to be deleted later
		double  currentCityPopulation = 0;  		// originally the variable number - renamed to currentCityPopulation - Loop control variable
		double  cityGrowthRate = 0;					// may need to change from int to double or float
		int numberOfYears = 0;
		
												// Scanner object for keyboard input
		Scanner kb = new Scanner(System.in);
		
																							 // the number input has been changed - user input sets cityPopulation -  Get user input for the size of the square table
		System.out.print("Please enter the current city population in millions: ");
		currentCityPopulation = kb.nextDouble();                                       		 // kb.nextDouble();      kb.nextInt();   
		
		System.out.print("Please enter the projected city population growth rate: ");
		cityGrowthRate = kb.nextDouble();													// kb.nextDouble();     kb.nextInt();			
		
		System.out.print("Please enter the number of years into the future: ");		//    \n   -- this is not a good place to put a line break -- looks funny
		numberOfYears = kb.nextInt();
		
																					// print the table header
		System.out.println("\n");													// i find that it's better just to print a line break all on it's own -- i guess - it look funny when I inserted it into the other one
		System.out.println("Years          City Population"); 						// use      \n        to create a line break in java
		System.out.println("==============================");						//    		System.out.println("-----------------------");
																					//	System.out.println("-----------------------");
		
																					// use a loop to print from 1 to the number entered
		for (int i=0; i<=numberOfYears; i++) {										// i think that i should remove i<number												// number needs to be converted into city population -- i needs to be converted into number of years -- i need to use growth rate
																					// can also do
			// currentCityPopulation = currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i); 		//    numberOfYears-1     currentCityPopulation = currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i);
			System.out.printf("%d                %.2f\n", i, currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i)); 			// System.out.printf       (1+cityGrowthRate/100)      I think that i need to use Math.pow()   like compound interest			(1+(cityGrowthRate/100)));				// can also use \t to indicate space or use in place of actual spaces
		//  System.out.printf("%d                %.2f\n", i, currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i));
		//  System.out.printf("%d                %.2f\n",i + "                " + currentCityPopulation * Math.pow(1 + cityGrowthRate / 100, i));	
	        kb.close();
	         
	    }

	}

}






/*
 * 
 * 
 * 
 * 
	

		Please submit the .java file (i.e., the source files).
You can use printf() for formatted result
%3d for three digits of integer
%10.2f for a float number with 2 digits after the decimal point and a total length of 10 digits
		
(1+(cityGrowthRate/100)));		
		Please submit the .java file (i.e., the source files).
		You can use printf() for formatted result
		%3d for three digits of integer
		%10.2f for a float number with 2 digits after the decimal point and a total length of 10 digits



		This is originally the squares assignment being repurposed for the city population assignment  -- Repurposed 
																										  repurposed	
		
		System.out.print("Please enter an integer for printing the squares table: ");



// (int i=0; i<number; i++)
 * 
 * (int i=1; i<=number; i++)   
 */
// System.out.println(i+1+"      "+(i+1)*(i+1));
