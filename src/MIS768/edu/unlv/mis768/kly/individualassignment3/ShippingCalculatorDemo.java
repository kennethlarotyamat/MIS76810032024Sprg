/*		
		Author's Name: 		    	Kenneth Larot Yamat

     	Purpose of Program:			To calculate the shipping cost of a parcel at a 
     	                          	parcel service store
     						    	 
  		Date Due:					March 3rd, 2024
*/
package edu.unlv.mis768.kly.individualassignment3;

import java.io.IOException;
import java.util.Scanner;

import edu.unlv.mis768.kly.individualassignment2.CreateTranscript;

public class ShippingCalculatorDemo {
	
	private static char yesOrNoEntry;
	

	public static void main(String[] args) throws IOException {
		
	    String red = "\u001B[31m";
	    String reset = "\u001B[0m";
	    String green  = "\u001B[32m";
		int entryNumber = 1;
		final String THE_PLACEHOLDER = "PLACEHOLDER"; // this is used for things that I will calculate later,
		double packageWeight = 0;
		double packageLength = 0;
		double packageWidth = 0;
		double packageHeight = 0; //  = keyboard.nextDouble();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(reset+ red+ "Greetings:  " + reset + " Utilize this terminal to determine the costs of shipping your parcel(s). ");
		System.out.println("             Please enter the"+ red + " weight"+reset+" and the "+ red +"dimensions "+reset+ "of your parcel: ");
		System.out.println(" ");
		do {
			System.out.println(reset+"                                     Data for Parcel # " + entryNumber); 
			System.out.println(" ");
						
						// /**/System.out.println("                                     Data for Package # 1"); // entryNumber// this number needs to increment depending on the number of packages. // this number needs to iterate depending on the number of packages.
									
						// this line is being moved down System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel:"); // " and the "+ red +"dimensions "+reset+ 
						// System.out.println(" "); // I don't know what's going on here, the line won't skip. I know what it is, it's on the wrong line.
						//keyboard.nextLine();
						
						//		System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel:");
						//		double packageWeight = keyboard.nextDouble(); // this needs to be a double. // String packageWeight = keyboard.nextLine();  // this needs to be a double. // String packageWeight = keyboard.nextLine();
						//		keyboard.nextLine();
						
						// Package package = new Package(packageWeight, packageLength, packageWidth, packageHeight);
		
		Package parcelPackage = new Package(packageWeight, packageLength, packageWidth, packageHeight); // creates a new instance of parcelPackage

		
		
		
						//					// start while true
						//					while(true) {
						//						
						//					System.out.print("Please enter the"+ red + " weight "+reset+"of your parcel: " +green); // System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel: "); // i figured out what it is. I'm using println rather than just print. // there is something screwy going on here, it keeps skipping a line for the user's input and it's driving me nuts. // System.out.println("Please enter the weight of your parcel: "); // System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel: "); // System.out.println(("Please enter the"+ red + " weight "+reset)+("of your parcel: ")); // user enters and sets the weight of the package being shipped.
						//					packageWeight = parcelPackage.keyboard.nextDouble(); // setPackageWeight. // parcelPackage.setPackageWeight(keyboard); // .keyboard.nextDouble();// packageWeight = parcelPackage.setPackageWeight.keyboard.nextDouble(); // this.
						//					parcelPackage.setPackageWeight(packageWeight);
						//					// System.out.println(" ");
						//					packageWeight = parcelPackage.getPackageWeight();
						//				    if (packageWeight == -1) {
						//				        System.out.println(" ");
						//				         // this stops the program if the package weight is invalid. // Break out of the loop
						//				    } else {
						//				    	break; // // System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel: "); // i figured out what it is. I'm using println rather than just print. // there is something screwy going on here, it keeps skipping a line for the user's input and it's driving me nuts. // System.out.println("Please enter the weight of your parcel: "); // System.out.println("Please enter the"+ red + " weight "+reset+"of your parcel: "); // System.out.println(("Please enter the"+ red + " weight "+reset)+("of your parcel: ")); // user enters and sets the weight of the package being shipped.
						//				    }
						//				    
						//					} // end while true // System.out.println(" "); // this stops the program if the package weight is invalid. // Break out of the loop // setPackageWeight. // parcelPackage.setPackageWeight(keyboard); // .keyboard.nextDouble();// packageWeight = parcelPackage.setPackageWeight.keyboard.nextDouble(); // this.
				
						// The Original version is above, I need a clean one without comments for the other user input steps. // refresh
						
								//	    if (packageWeight == -1) {
						//	        System.out.println(" ");
						//	        System.out.print("Please enter the"+ red + " weight "+reset+"of your parcel: " +green);
						//	        parcelPackage.setPackageWeight(packageWeight);
						//	        packageWeight = parcelPackage.getPackageWeight();
						//	        // break; // this stops the program if the package weight is invalid. // Break out of the loop
						//	    }
						// packageWeight = parcelPackage.getPackageWeight();
						// packageWeight = pacelPackage.setPackageWeight;// double packageWeight = keyboard.nextDouble(); 
						// double packageWeight = keyboard.nextDouble();
						
						// keyboard.nextLine();

		while (true) {

			System.out.print("Please enter the" + red + " weight " + reset + "of your parcel: " + green);
			packageWeight = parcelPackage.keyboard.nextDouble();
			parcelPackage.setPackageWeight(packageWeight);

			packageWeight = parcelPackage.getPackageWeight();
			if (packageWeight == -1) {
				System.out.println(" ");

			} else {
				break;
			}

		}
		// that took forever, and I'm only done dealing with the package weight.
		
		/*
		 		while (true) {

			System.out.print(reset+"Please enter the"+ red + " length "+reset+"of your parcel: "+green);
			packageLength = parcelPackage.keyboard.nextDouble();
			parcelPackage.setPackageLength(packageLength);

			packageLength = parcelPackage.getPackageLength();
			if (packageLength == -1) {
				System.out.println(" ");

			} else {
				break;
			}

		}
		
		
		System.out.print(reset+"Please enter the"+ red + " length "+reset+"of your parcel: "+green); // System.out.println("Please enter the"+ red + " length "+reset+"of your parcel: "); // user enters and sets the length of the package being shipped.
packageLength = keyboard.nextDouble();// double packageLength = keyboard.nextDouble();
keyboard.nextLine();
		
		
		*/
		
		
		

		
		
//		System.out.print(reset+"Please enter the"+ red + " length "+reset+"of your parcel: "+green); // System.out.println("Please enter the"+ red + " length "+reset+"of your parcel: "); // user enters and sets the length of the package being shipped.
//		packageLength = keyboard.nextDouble();// double packageLength = keyboard.nextDouble();
//		keyboard.nextLine();
		
				while (true) {
			
			System.out.print(reset+"Please enter the"+ red + " length "+reset+"of your parcel: "+green);
			packageLength = parcelPackage.keyboard.nextDouble();
			parcelPackage.setPackageLength(packageLength);
			
			packageLength = parcelPackage.getPackageLength();
			if (packageLength == -1) {
				System.out.println(" ");
			
				} else {
					break;
				}
			
			}
		
		System.out.print(reset+"Please enter the"+ red + " width "+reset+" of your parcel: "+green); // System.out.println("Please enter the"+ red + " width "+reset+"of your parcel: "); // user enters and sets the width of the package being shipped.
		packageWidth = keyboard.nextDouble(); // double packageWidth = keyboard.nextDouble(); // double packageWidth = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.print(reset+"Please enter the"+ red + " height "+reset+"of your parcel: "+green); // System.out.println("Please enter the"+ red + " height "+reset+"of your parcel: "); // user enters and sets the height of the package being shipped.
		packageHeight = keyboard.nextDouble();// double packageHeight = keyboard.nextDouble();
		keyboard.nextLine();
		
		// Package pacelPackage = new Package(packageWeight, packageLength, packageWidth, packageHeight);
		// parcelPackage.setPackageWeight(packageWeight);
		
		// CreateTranscript transcript = new CreateTranscript(courseNumber, courseHours, letterGrade);
		// transcript.setLetterGrade(letterGrade);
		
		System.out.println(" ");
		
		/*packageWeight = parcelPackage.getPackageWeight();*/ 
		System.out.println(reset+"The parcel has an actual weight of: " + packageWeight); // System.out.println(reset+"The parcel has an actual weight of: " + getPackageWeight()); // System.out.println(reset+"The parcel has an actual weight of: " + THE_PLACEHOLDER); // getPackageWeight()
		System.out.println(reset+"The parcel has a dimensional weight of: " + THE_PLACEHOLDER);
		System.out.println(reset+"The parcel has the following dimensions: " + THE_PLACEHOLDER);
		System.out.println(reset+"The parcel has a shipping cost of: " + THE_PLACEHOLDER);
		
		System.out.println(" ");
		// entryNumber++;
		System.out.print(reset+"Will you be shipping any additional parcels? (Y/N): "+green);
		yesOrNoEntry = keyboard.next().charAt(0); // char yesOrNoEntry = keyboard.next().charAt(0); // allows a Y/N or Yes/No response
		keyboard.nextLine();
		System.out.println(" ");
		entryNumber++;
		} while (yesOrNoEntry == 'y' || yesOrNoEntry == 'Y'); 
		
		// I'm starting to understand what object oriented design is 
		//
		// it's like this - the demo class is like an HTML page, and the model class is like the JavaScript file.
		// when I was starting this assignment, I started with the demo class, because like an HTML page, it's 
		// something I can see. and it's something I can interact with.
		
		
	}


}

/* 
 [0m[31mGreetings:  [0m Utilize this terminal to determine the cost to ship your parcel. 
             Please enter the[31m weight[0m and the [31mdimensions [0mof your parcel: 
 
[0m                                     Data for Parcel # 1
 
Please enter the[31m weight [0mof your parcel: [32m50
[0mPlease enter the[31m length [0mof your parcel: [32m50
[0mPlease enter the[31m width [0m of your parcel: [32m50
[0mPlease enter the[31m height [0mof your parcel: [32m50
 
[0mThe parcel has an actual weight of: PLACEHOLDER
[0mThe parcel has a dimensional weight of: PLACEHOLDER
[0mThe parcel has the following dimensions: PLACEHOLDER
[0mThe parcel has a shipping cost of: PLACEHOLDER
 
[0mWill you be shipping any additional parcels? (Y/N): [32my
 
[0m                                     Data for Parcel # 2
 
Please enter the[31m weight [0mof your parcel: [32m50
[0mPlease enter the[31m length [0mof your parcel: [32m50
[0mPlease enter the[31m width [0m of your parcel: [32m50
[0mPlease enter the[31m height [0mof your parcel: [32m50
 
[0mThe parcel has an actual weight of: PLACEHOLDER
[0mThe parcel has a dimensional weight of: PLACEHOLDER
[0mThe parcel has the following dimensions: PLACEHOLDER
[0mThe parcel has a shipping cost of: PLACEHOLDER
 
[0mWill you be shipping any additional parcels? (Y/N): [32my
 
[0m                                     Data for Parcel # 3
 
Please enter the[31m weight [0mof your parcel: [32m50
[0mPlease enter the[31m length [0mof your parcel: [32m50
[0mPlease enter the[31m width [0m of your parcel: [32m50
[0mPlease enter the[31m height [0mof your parcel: [32m50
 
[0mThe parcel has an actual weight of: PLACEHOLDER
[0mThe parcel has a dimensional weight of: PLACEHOLDER
[0mThe parcel has the following dimensions: PLACEHOLDER
[0mThe parcel has a shipping cost of: PLACEHOLDER
 
[0mWill you be shipping any additional parcels? (Y/N): [32my
 
[0m                                     Data for Parcel # 4
 
Please enter the[31m weight [0mof your parcel: [32m50
[0mPlease enter the[31m length [0mof your parcel: [32m50
[0mPlease enter the[31m width [0m of your parcel: [32m50
[0mPlease enter the[31m height [0mof your parcel: [32m50
 
[0mThe parcel has an actual weight of: PLACEHOLDER
[0mThe parcel has a dimensional weight of: PLACEHOLDER
[0mThe parcel has the following dimensions: PLACEHOLDER
[0mThe parcel has a shipping cost of: PLACEHOLDER
 
[0mWill you be shipping any additional parcels? (Y/N): [32my
 
[0m                                     Data for Parcel # 5
 
Please enter the[31m weight [0mof your parcel: [32m50
[0mPlease enter the[31m length [0mof your parcel: [32m50
[0mPlease enter the[31m width [0m of your parcel: [32m50
[0mPlease enter the[31m height [0mof your parcel: [32m50
 
[0mThe parcel has an actual weight of: PLACEHOLDER
[0mThe parcel has a dimensional weight of: PLACEHOLDER
[0mThe parcel has the following dimensions: PLACEHOLDER
[0mThe parcel has a shipping cost of: PLACEHOLDER
 
[0mWill you be shipping any additional parcels? (Y/N): [32my
 
[0m                                     Data for Parcel # 6
 
Please enter the[31m weight [0mof your parcel: [32mchickens
Exception in thread "main" java.util.InputMismatchException
	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
	at java.base/java.util.Scanner.next(Scanner.java:1602)
	at java.base/java.util.Scanner.nextDouble(Scanner.java:2573)
	at edu.unlv.mis768.kly.individualassignment3.ShippingCalculatorDemo.main(ShippingCalculatorDemo.java:44)
	*/

//Please enter the file name where you would like to print your transcript: D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\ unlv\mis768\kly\individualassignment2\transcript02292024.txt
//Data has been written to D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\ unlv\mis768\kly\individualassignment2\transcript02292024.txt successfully.
//
//Enter a course number for entry # 1: Advanced Studies in Chickens 101
//Enter credit hours for entry # 1: 3
//Enter letter grade earned for entry # 1: a
//Do you have additional course details to enter? (Y/N): y
//Enter a course number for entry # 2: advanced studies in geese 102
//Enter credit hours for entry # 2: 3
//Enter letter grade earned for entry # 2: a
//Do you have additional course details to enter? (Y/N): y
//Enter a course number for entry # 3: intermediate duck related conspiracy theories 103
//Enter credit hours for entry # 3: a
//Exception in thread "main" java.util.InputMismatchException
//	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//	at java.base/java.util.Scanner.next(Scanner.java:1602)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//	at edu.unlv.mis768.kly.individualassignment2.CreateTranscriptDemo.main(CreateTranscriptDemo.java:59)
// 
// 
// Enter a course number for entry # 1: Advanced Studies in Chickens 232
//Enter credit hours for entry # 1: 4
//Enter letter grade earned for entry # 1: a
//Do you have additional course details to enter? (Y/N): y
//Enter a course number for entry # 2: Advanced Studies in Orange Juice 443
//Enter credit hours for entry # 2: 3.5
//Exception in thread "main" java.util.InputMismatchException
//	at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//	at java.base/java.util.Scanner.next(Scanner.java:1602)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//	at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//	at edu.unlv.mis768.kly.individualassignment2.CreateTranscriptDemo.main(CreateTranscriptDemo.java:59)
//
//
//		    String red = "\u001B[31m";
//		    String reset = "\u001B[0m";
//
//			ANSI escape codes
//
//		    String black = "\u001B[30m";
//		    String red = "\u001B[31m";
//		    String green = "\u001B[32m";
//		    String reset = "\u001B[0m";
//		    
//		    Black: \u001B[30m
//			Red: \u001B[31m
//			Green: \u001B[32m
//			Yellow: \u001B[33m
//			Blue: \u001B[34m
//			Magenta: \u001B[35m
//			Cyan: \u001B[36m
//			White: \u001B[37m

//System.out.println("[31mGreetings:  [0m Utilize this terminal to determine the shipping costs of your parcel.");		
/*
Nectar
Enter a course number for entry # 1: Orange Juice 232
Enter credit hours for entry # 1: 3
Enter letter grade earned for entry # 1: a
Do you have additional course details to enter? (Y/N): y
Enter a course number for entry # 2: Lemonade 443
Enter credit hours for entry # 2: 3
Enter letter grade earned for entry # 2: a
Do you have additional course details to enter? (Y/N): y
Enter a course number for entry # 3: Milk 868
Enter credit hours for entry # 3: 3
Enter letter grade earned for entry # 3: c
Do you have additional course details to enter? (Y/N): y
Enter a course number for entry # 4: Nectar
Enter credit hours for entry # 4: 3
Enter letter grade earned for entry # 4: a
Do you have additional course details to enter? (Y/N): n
Grade Point Average: 3.50
Would you like to printout of your transcript? (Y/N): y




 */
// public class ShippingCalculatorDemo {
// The name of a class should be a noun/noun-phrase.
// I'm frustrated right now. everything is a disaster, and nothing is going right.'
// and I don't anticipate things getting better. this is a nightmare.'


/*
"Dimensional weight, also known as volumetric weight, is a pricing technique used 
by postal services and commercial freight companies. It's based on the cubic capacity 
of a package, rather than its weight.""
*/