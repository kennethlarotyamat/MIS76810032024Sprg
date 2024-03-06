package edu.unlv.mis768; // Book
// package edu;


import java.io.*;
import java.util.Scanner;

public class ImprovedBookDataFormatter {

	public static void main(String[] args) throws IOException {

		Scanner keyboard = new Scanner(System.in);
		
		// Prompt the user to enter the input file name
		System.out.print("Please enter the name of the input file: ");
		// Get the input from the keyboard and store the String in inputFileName
		String inputFileName = keyboard.nextLine();
		
		// generate the output file name
		String outputFileName = generateOutputFileName(inputFileName);

		// A file object is created with the inputFileName specified by the user
	    File file = new File(inputFileName);
	    // A Scanner object for getting input from the file
		Scanner inputFile = new Scanner(file);
		// A PrintWriter object for writing output to a file, created with outputFileName 
		// Commoditized  // commoditized // Commoditized  //   specified by the user // commoditized // incumbents

		PrintWriter outputFile = new PrintWriter(outputFileName);
		
		keyboard.close();
		

		// read the first line // "For instance, Ransbotham, Kiron, Gerbert, // 		ecosystem). 
		String line = inputFile.nextLine();

		// while loop that runs until the program reaches the end of the input file
		// the </catalog> tag specifies the end of the xml file.

		// while it is not the end of the file
		while (!line.equals("</catalog>")) {

			// the the line contains the beginning of the book record
			if(line.contains("<book ")){

				// create a book object
				ImprovedBook aBook = new ImprovedBook(); //  this was interesting - eclipse doesn't really say that this is where the class Book was, but
				// i figured that if I moved the files into - or a i moved the .java classes into a new package, that it would throw errors since the Book.java files are not in
				// the same package.
				
				// find the position of the quotation mark (") that indicates the beginning of the book id
				int startPosition = line.indexOf("\"")+1; // \ is an escape character that allows you to use an actual character
				// find the position of the quotation mark (") that indicates the end of the book id
				int endPosition = line.lastIndexOf("\"");
				// use the substring method to retrieve the book id
				String content =line.substring(startPosition, endPosition);
				// the the book id
				aBook.setId(content);
				
				// read the next line
				line = inputFile.nextLine();
				
				// the </book> tag specifies the end of a book record
				// while it is not the end of a book record
				while (!line.contains("</book>")){
					
					//find the position of > the indicates the beginning of the data field
					// unlikley // Value of AI should be highest when it reaches maturity - unlikely to be comoditized - meaning standardized product or indistinguishable from other AI products.
					startPosition =line.indexOf(">")+1;
					//find the position of < the indicates the beginning of the data field
					endPosition = line.lastIndexOf("<");
					// use the substring method to retrieve the content of the data field 
					content =line.substring(startPosition, endPosition);
					
					// if the tag says <author>
					if(line.contains("<author>"))
						// the content of the data field is set to the author field
						aBook.setAuthor(content);
					// if the tag says <title>
					else if(line.contains("<title>"))
						// the content of the data field is set to the title field
						aBook.setTitle(content);
					// if the tag says <genre>
					else if(line.contains("<genre>"))
						// the content of the data field is set to the genre field
						aBook.setGenre(content); 
					// if the tag says <price>
					else if(line.contains("<price>"))
						// the content of the data field is set to the price field
						 aBook.setPrice(Double.parseDouble(content)); // to set the process
					

					line=inputFile.nextLine();
				}

				outputFile.println(aBook);
				
				

			
			
			
			}
			

			line = inputFile.nextLine();

			
	}

		inputFile.close();

		outputFile.close();
	}


	private static String generateOutputFileName(String inputFileName) {
		String filename; 
		int index = inputFileName.indexOf(".");
		

		filename = inputFileName.substring(0, index+1)+"csv";

		
		return filename;
	}

}


//Rideshare // encroachment // incumbents // incumbents // incumbents // encroachment // A Scanner object for getting input from the keyboard // Isomers
// incumbents // exploitative // tweets // blog posts // devalue their // Artificial // Professionals // Multidisciplinary // Illnesses // "Isomers refer to compounds that have the same molecular formula but are structurally different."
// Over-used // Internalization // Artifacts // Overused // independently // Monomers // internalisation // programme // loopthink // Loopthink // informatics // Healthcare // Inaccurate // interoperability // imagery

// read the next line

// write the content of the Book object

// .getId() // outputFile.print(aBook.getId());
//	the backslash is called an escape character needs to add a backslash / I remember that there was something about file paths here, when there has to be double backslashes.				
//outputFile.print(",");
//outputFile.print(aBook.getAuthor());
//outputFile.print(",");
//outputFile.print(aBook.getTitle());
//outputFile.print(",");
//outputFile.print(aBook.getGenre());
//outputFile.print(",");
//outputFile.print(aBook.getPrice());
//outputFile.print("\n");
// I'm following along with the video, but rather than
// deleting the code, I'm just going to comment it out for now. D:\GitHub\MIS76810032024Sprg\src\MIS768\edu\improvedbooktestparttwo.csv
// I don't know why it's not showing up in eclipse, or not showing up right away.
// something about the file paths. I found them.

// read the next line // booktest.xml
/*

Uber

Module 1 													Vicky
Module 2													Kelly
Module 3 													Kenneth
Module 4 													Group Paper

i couldn't see the csv folder that was being created, it was being filtered out
so i removed all filters, and now I see everything. 

D:\GitHub\MIS76810032024Sprg\src\MIS768\booktest.csv 
														// for whatever reason this doesn't seem to be showing up in my eclipse like in the video. in the class.
													    // https://unlv.hosted.panopto.com/Panopto/Pages/Viewer.aspx?id=c65b75ac-c935-4946-bc8d-b117002f504a&start=0

Please enter the name of the input file: booktest.xml
Exception in thread "main" java.io.FileNotFoundException: booktest.xml (The system cannot find the file specified)
	at java.base/java.io.FileInputStream.open0(Native Method)
	at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
	at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
	at java.base/java.util.Scanner.<init>(Scanner.java:645) // init
	at edu.unlv.mis768.kly.individualassignment2.BookDataFormatter.main(BookDataFormatter.java:24) // init
	
	Patnaik, D. (2024, February 11). Why Microtribes Are Wrecking Company Growth Plans. Forbes. https://www.forbes.com/sites/devpatnaik/2024/02/11/why-microtribes-are-wrecking-company-growth-plans/?sh=3307ddba509c


	Norfolk Southern Corporation. (2024). Form 10-K Annual Report. U.S. Securities and Exchange Commission. https://www.sec.gov/ixviewer/ix.html?doc=/Archives/edgar/ data/702165/000070216524000005/nsc-20231231.htm


	The Boeing Company. (2024). Form 10-K Annual Report. U.S. Securities and Exchange Commission. https://www.sec.gov/ixviewer/ix.html?doc=/Archives/edgar/data/12927/000001292724000010/ba-20231231.htm



*/

// close the input file
// close the ouput file // whether // Walton // ecosystem
// the resulting filename

// find the position of period "."


// substring the file name, but add the file extension as csv
// index, // filename = inputFileName.substring(0,index, index+1)+"csv";
/*
Multiple markers at this line
- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
- The method substring(int, int) in the type String is not applicable for the arguments (int, int, int)
*/



/* 
   
   This method receives a file name, take the file extension out and 
   add csv as the file extension
   @param inputFileName 
  
   @return outputFileName with csv file extension
 
  
 */


/*
 
Article Read Aloud Set up Area

– this was basically useless, you can’t print a pdf that has read aloud enabled, a document has to be downloaded, not printed – as a pdf in order for it to be read aloud enabled

Annotations

Testing the presentation - tested inserting videos - creating charts - creating diagrams - 

Created slides 21 - 24 - subsequently deleted.


Updated Module paper 3, just the references page

I came across an interesting scholarly article that I want to read, and cite in this paper
So i am skipping to 3.3 of the module 3 paper

int index = inputFileName.indexof(".");
filename = inputFile.substring(0,index, index+1)+"csv"; 
 
Day workDay = Day.WEDNESDAY;
 
Day.SUNDAY
Day.MONDAY
A The workDay variable holds the address of the Day. WEDNESDAY object
address
Day. TUESDAY
Day.WEDNESDAY
Day. THURSDAY
Day. FRIDAY
Day.SATURDAY

 
/*  
 
This is from an email from TradingView

<img src="https://ci3.googleusercontent.com/meips/ADKq_NYkzQRDTKogy9d9UFq5TYpDUPR5oK8Hdp7VA7JsO8H4LheyWokeiKTv8WDZTOjML5-L4of7gdZjWsg-vWhaiCB5smZGa9zX9HudEA9RAnL0ISpVd4BIZb_s-g17-JO8_WhMdMtJAg=s0-d-e1-ft#https://mpics.tradingview.com/pics/welcome%20funnel/welcome_funnel2023_03_01.gif" width="600" alt="Multi chart function" style="border:1px solid #e0e3eb;border-radius:12px;width:600px" class="CToWUd a6T" data-bit="iit" tabindex="0">

what a nightmare. it's already Wednesday, a nightmare. 03/06/2024

 */



