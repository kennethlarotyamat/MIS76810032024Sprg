package mis768unlv;

import java.util.Scanner;

public class SecretWord {
	   public static void main(String[] args) {
		      String theWord = "PROFESSIONAL";
		      String input;     // To hold the user's input
		      
		      // Create a Scanner object for keyboard input.
		      Scanner keyboard = new Scanner(System.in);
		      
		      // Prompt the user to enter the secret word.
		      System.out.print("Enter the secret word: ");
		      input = keyboard.nextLine();

		      if (theWord.equalsIgnoreCase(input)){
//		    	  can also be written in reverse as
//		    	  inuput.equalsIgnoreCase(theWord)
		         System.out.println("Congratulations! You know the " +
		                            "secret word!");
		      }
		      else {
		         System.out.println("Sorry, that is NOT the " +
		                            "secret word!");
		      }
		   }

}




/*






		  try {

		  } finally {
            keyboard.close();
        }


  
 */


 