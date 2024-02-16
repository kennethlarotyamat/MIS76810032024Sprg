package edu.unlv.mis768.kly;

import java.util.Random;

public class RoulettePocketDemo {
	   public static void main(String [] args)   {
		   // Create a Random object for generating random numbers
		   Random rand = new Random();
		   // generate a random number between 0 (inclusive) and 37(exclusive)
		   int num = rand.nextInt(37);
	
		   // instantiate a Roulette Pocket object
		   RoulettePocket pocket = new RoulettePocket();
		   // set the number
		   pocket.setNumber(num);
		   
		   // print out the number and color for testing
		   System.out.println("The number is: "+pocket.getNumber()+" and the color is "+pocket.getColor());
		   
	   }
}


// package edu.unlv.mis768.labwork8;
