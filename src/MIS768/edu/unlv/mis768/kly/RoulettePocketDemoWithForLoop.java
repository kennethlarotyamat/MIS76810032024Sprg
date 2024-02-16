package edu.unlv.mis768.kly;

import java.util.Random;

public class RoulettePocketDemoWithForLoop {
	   public static void main(String [] args)   {
		   // Create a Random object for generating random numbers
		   for (int i = 0; i < 10; i++) {Random rand = new Random();
		   // generate a random number between 0 (inclusive) and 37(exclusive)
		   int num = rand.nextInt(37);
	
		   // instantiate a Roulette Pocket object
		   RoulettePocket pocket = new RoulettePocket();
		   // set the number
		   pocket.setNumber(num);
		   
		   // print out the number and color for testing //       for (int i = 0; i < array.length; i++) // from sales reports
		   System.out.println("The number is: "+pocket.getNumber()+" and the color is "+pocket.getColor());}
		   // so if you put the for loop -- for (int i = 0; i < 10; i++) {Random rand = new Random(); -- just around the print command, you get the same
		   // number generated over and over or the same statement over and over.
		   // the for loop has to be started before the random number is generated.
	   }
}

// unfortunately i was not recording the work from the very beginning, so I had to do it -- i had to make the video by doing undo and redo.
// package edu.unlv.mis768.labwork8;
