package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork5;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SalesReports {
	/**
	This program opens a file containing the sales
	amounts for 30 days. It calculates and displays
	the total sales and average daily sales.
	 * @throws IOException 
	*/
	public static void main(String[] args) throws IOException  {
	      final int NUM_DAYS = 30;  // Number of days of sales
	      String filename;          // C:\Users\KLYam\OneDrive\Documents\GitHub\MIS76810032024Sprg\src\nightmare1\src\edu\ unlv\mis768\kly\MonthlySales.txt // The name of the file to open // 
	      double totalSales;        // Total sales for period
	      double averageSales;      // Average daily sales
	      		
		  // declare a Scanner object for keyboard input
		  Scanner kb = new Scanner(System.in);
		  // prompt the user to enter the file name
		  System.out.print("File name please?");
		  // get the string from the user 
		  filename = kb.nextLine();			
	      
	      // Get the total sales from the file.
	      totalSales = getTotalSales(filename);
	      
	      // Calculate the average.
	      averageSales = totalSales / NUM_DAYS;
	      
	      // Display the total and average.
	      System.out.println("The total sales for the period is $"+totalSales);
	      System.out.println("The average daily sales were $"+ averageSales);
	}
	
	public static double getTotalSales(String filename) {

	
	
	
	
	
	
	
	
	}

}

//  this creates double brackets 2 dimensional array // double [] [] scores = new double [3] [4]

/**
 * 	// Declare a reference to an array that will hold integers
 * 
 
 
 rows for a two dimensional array that are that have
 different lengths is called a ragged array
 
 specific number of rows, but no columns
 
 
 for (int row = 0; row < 3; row++) {
 for (int col = 0; col < 4; col ++){
 
 System.out.print ("Enter a score: ");
 scores [row] [col] = keyboard.nextDouble();
 }
 
 }
 
 
 float [] temperatures = new float [100];
 char [] letters = new char [41];
 long [] letters = new char [41]
 
 int numTests;
 int [] test;
 Scanner keyboard = new Scanner (System.in);
 System.out.print ("how many tests do you have?");
 numTests = keyboard.nextInt();
 tests = new int [numTests];
 
 
 
 
 ArrayList object automatically expend when new item is added
 or automatically shrinks 
 
 import java.util.ArrayList
 
 ArrayList<String> list = new ArrayList<String>(100);
 
 leave it blank
 nameList.add("James");
 nameList.add("Catherine");
 
 System.out.println(nameList);
 
 
 
 * 
 */
