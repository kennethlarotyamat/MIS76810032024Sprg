package mis768unlv;

import java.util.Scanner;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double BASE_FEE = 4.5;
		final double OVERWEIGHT_FEE = 7;
		final double WEIGHT_LIMIT = 20;
		
		double weight;
		double charge;
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Please enter the weight of the package:");
		weight = kb.nextDouble();
		
		charge = weight * (weight<=WEIGHT_LIMIT? BASE_FEE: OVERWEIGHT_FEE);
		
		System.out.print("The total charge is:$" +charge);
		

	}

}


/* 
 
 
I'm experiencing quite a bit of anxiety right now. 
 
 
 
 
 
*/
