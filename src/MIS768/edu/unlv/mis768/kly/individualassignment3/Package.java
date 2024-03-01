package edu.unlv.mis768.kly.individualassignment3;

import java.util.Scanner;

public class Package {
    String red = "\u001B[31m";
    String reset = "\u001B[0m";
    String green  = "\u001B[32m";
    String brown  = "\u001B[33m";
	private double packageWeight;
	private double packageLength;
	private double packageWidth;
	private double packageHeight;
	
	Scanner keyboard = new Scanner(System.in);
	
											// 100 outside linear inches (length plus width plus height).
											// private String errorMessage = "You have entered invalid information, please review your input, and re-enter.";
											// https://gist.github.com/mgumiero9/665ab5f0e5e7e46cb049c1544a00e29f
											// Yellow: \u001B[33m // 43: Yellow or brown
										
											//	public double getPackageWeight() {
											//		if (0 < packageWeight && packageWeight <= 120) {
											//	        return packageWeight;
											//	    } else if (packageWeight < 0) {
											//	        System.out.println(reset + red + "The weight of the parcel has been entered as a negative number. Please re-enter the package weight." + reset);
											//	        return -1.00;   // return -1;
											//	    } /* else if (packageWeight > 120) {
											//	        System.out.println(reset + brown + "Chestnut" + red + "+" + green + "Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset);
											//	        return -1;
											////	    }*/ else if (packageWeight > 120) /*(packageWeight > 120)*/ {
											////	        System.out.println(reset + brown + "Chestnut" + red + "+" + green + "Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset);
											////	        return -2.00; // return -1;
											//	    }
											//	}
	public double getPackageWeight() {
	    if (packageWeight > 0 && packageWeight <= 120) {
	        return packageWeight;
	    } else if (packageWeight < 0) {
	    	System.out.println(" ");System.out.println(reset + red + "The weight of the parcel has been entered as a negative number. Please re-enter the package weight." + reset);
	        return -1;
	        // break;
	    } else if (packageWeight > 120) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 120 American Pounds in weight." + reset); // System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
	        return -1;
	    } else {
	        System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }
	}

	public void setPackageWeight(double packageWeight) {
		this.packageWeight = packageWeight; 	
													// keyboard.nextDouble();
													// keyboard.nextLine();
	}

	public Package(double packageWeight, double packageLength, double packageWidth, double packageHeight ) {
		this.packageWeight = packageWeight;
		this.packageLength = packageLength;
		this.packageWidth = packageWidth;
		this.packageHeight = packageHeight;
		// super();
		// TO DO Auto-generated constructor stub
	}
	public Package(String packageWeight, String packageLength, String packageWidth, String packageHeight ) {
		this.packageWeight = Double.parseDouble(packageWeight);
		this.packageLength = Double.parseDouble(packageLength);
		this.packageWidth  = Double.parseDouble(packageWidth );
		this.packageHeight = Double.parseDouble(packageHeight);
		// super();
		// TO DO Auto-generated constructor stub
	}

	public double setPackageWeight(Scanner keyboard2) {
		// TO DO Auto-generated method stub
		return 0;
	}

	public double getPackageLength() {
		if (packageLength > 0 && (packageLength+packageWidth+packageHeight)<=100) {
			return packageLength;
			
		} else if (packageLength > 0) {
			System.out.println(" ");System.out.println(reset + red + "The length of the parcel has been entered as a negative number. Please re-enter the package length." + reset);
			return -1;
			
		} else if (packageLength+packageWidth+packageHeight >= 100) {
	    	System.out.println(" ");
	    	System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages exceeding 100 British inches in total outside liner inches." + reset); // System.out.println(reset + brown + "Chestnut" + red + " + " + green + "Hazel's" + reset + " Parcel Service cannot accept packages weighing in excess of 120 American Pounds." + reset); // System.out.println(reset + brown + "Chestnut " + red + " + " + green + " Hazel's" + reset + " Parcel Service cannot accept packages greater than 120 American Pounds." + reset); 
	    	System.out.println("Please consider shipping a different Package.");
        return -1;
		} else {
	        System.out.println(reset + red + "You have entered invalid information, please review your input, and re-enter." + reset);
	        return -1;
	    }

	}

	public void setPackageLength(double packageLength) {
		this.packageLength = packageLength;
	}

	public double getPackageWidth() {
		return packageWidth;
	}

	public void setPackageWidth(double packageWidth) {
		this.packageWidth = packageWidth;
	}

	public double getPackageHeight() {
		return packageHeight;
	}

	public void setPackageHeight(double packageHeight) {
		this.packageHeight = packageHeight;
	}
	
	

}
