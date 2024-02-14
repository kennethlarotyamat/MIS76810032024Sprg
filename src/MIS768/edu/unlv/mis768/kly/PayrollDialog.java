package edu.unlv.mis768.kly; // package edu.unlv.mis768.labwork7;

import javax.swing.JOptionPane;

public class PayrollDialog {

	public static void main(String[] args) {
		// declare variables
		String inputString; // for reading input
		String empName; // the employee's name
		int hours; // the employee's working hours
		double grossPay; // the grossPay to be calculated
		
		// get the name using a input box
		empName = JOptionPane.showInputDialog ("Please Enter the Name");
		
		
		// get the hours using a input box
		inputString = JOptionPane.showInputDialog("Please enter the Hours");
		// convert string to int
		hours = Integer.parseInt(inputString); // means parse string and convert it into an integer and assigned to hours variable
		
		

		
		// declare an Employee object
		Employee someone = new Employee();
		someone.setName(empName);
		
		// Show the result in a message box
		//
		JOptionPane.showMessageDialog(null, "Hey, "+someone.getName()+", the pay is $"+someone.calcSalary(hours));
		
		System.exit(0); // to end the program properly
		


	}

}

// string cannot be saved to an input variable int variable
// yeah, I remember this, I've had to deal with this, or i've come across this
// where something like a data type or incorrect data type error