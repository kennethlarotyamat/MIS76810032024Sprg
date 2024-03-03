/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/

package edu.unlv.mis768.kly.individualassignment3;

import java.util.ArrayList;

public class Shipment {
	private int 	theFrequentShipperIdentificationNumber;
	private int 	theTotalNumberOfPackages;
	final double 	THE_FREQUENT_SHIPPER_DISCOUNT = 0.05; 		// "if so, a 5% discount will be applied to the shipping cost."
	final double 	THE_BULK_PACKAGE_DISCOUNT = 0.05;			// additional “bulk package” discount of $20 off would be applied. // width // i wasn't sure if that was spelled correctly.
	private double  theGrandTotal;								// I'm trying to think. In the transcript assignment I put and updated the array in the demo class, but assignment
																// 3 requires that the array list is in the shipment model class. I don't know how this is going to work.
	// Here is goes.
	ArrayList<Double> packageShippingChargeArray = new ArrayList<Double>(); // ArrayList<Double> packageShippingChargesArray = new ArrayList<Double>(); // ArrayList<Double> packageShippingCostsArray = new ArrayList<Double>();  // ArrayList<Double> pointScaleTimesCreditHoursArray = new ArrayList<Double>();
																			 // System.out.println(packageShippingCostsArray);  // I will need this for testing later. //	System.out.println(courseNumberArray);			// this was for testing it can be reactivated if more testing is needed
	
	
	
	
	
	
	
}

// Frequent shipper
// Total package(s) being shipped
// Total shipping costs
// Frequent shipper discount
// Bulk shipment discount
/*

The following symbols are used in reporting and recording graduate student grades:

A		Superior (4.0)
B  		Passing (3.0)
C   	Average (2.0)
D		Below Average (1.0)
F		Failing

AD		Audit (not graded, no credit toward GPA)
I   	Incomplete (expires after one year; if not grade is submitted in that time-frame, the ‘I’ will default to an ‘F’ grade)

S  		Satisfactory

X		Hold: Grade is submitted upon completion of Thesis or Dissertation or Professional Paper
		Note: Faculty members have the option of using plus (+) and minus (-) for grades of A, B, C, and D. Exception: A+ grades are not given. 
		At the graduate level, grades below a B are generally considered unacceptable. Graduate students must have a 3.0 GPA in order to qualify for graduation.
		
		What a nightmare. So the highest possible grade I can obtain in the course is a C, but it's not clear to me. As a graduate student, if I would get a 2, or a 0.
		I would rather get a C than audit the class.



*/
/*

After all the packages are entered, the program will prompt the users to enter if they have “frequent-shipper” numbers; 
if so, a 5% discount will be applied to the shipping cost. If the total amount after the frequent-shipper discount is greater than $300, 
an additional “bulk package” discount of $20 off would be applied. The program shows the total number of packages to ship, subtotal 
before discount, frequent-shipper discount if applied, bulk package discount if applied, and the grand total.


*/