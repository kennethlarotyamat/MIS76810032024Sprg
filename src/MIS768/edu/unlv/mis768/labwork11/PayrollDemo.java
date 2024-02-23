package edu.unlv.mis768.labwork11;

import java.util.Scanner;

public class PayrollDemo {


    private static String employee = "employee";
    private static String staff = "staff";
    private static String manager = "manager";
    private static String classification = employee;
	

	public static void main(String[] args) {

		boolean validInput = false;
		Scanner keyboard = new Scanner(System.in);
		do {
			
			System.out.print("Is the employee classified as Staff or Manager?");

			String str = keyboard.nextLine().toLowerCase();

			if (str.contains("staff") || str.charAt(0) == 's') {
				classification = staff;
				System.out.println("The employee has been classified as Staff.");
				validInput = true;
			} else if (str.contains("manager") || str.charAt(0) == 'm') {
				classification = manager;
				System.out.println("The employee has been classified as Manager.");
				validInput = true;
			} else {
				classification = employee;
				System.out.println(
						
						"Please indicate if the employee in question is classified as either Staff or Manager.");
			}

		} while (!validInput);
		
		Manager m = new Manager();
		Staff s = new Staff();
		
		System.out.println("Please enter the number of hours worked by the employee.");
		double hours = keyboard.nextDouble();
		s.setHours(hours);
		if (classification.equals(staff)) {
			System.out.println("The Employee's Salary for the period in question should amount to: "+ s.calcSalary());

		} else if (classification.equals(manager)) {
			System.out.println("The Employee's Salary for the period in question should amount to: "+m.calcSalary());

		} else  {
			System.out.println("The Employee's classification has not been previously indicated.");

		}
	}
}

// this is taking forever, and I'm still not ever really knowing what I'm doing wrong.
// 0, 0 length,width,height // Cube c = new Cube(length,width,height);
// 
//classification == staff;
// TO DO Auto-generated method stub
// Exception in thread "main" java.lang.NullPointerException: Cannot invoke
// "String.contains(java.lang.CharSequence)" because "str" is null
// classification = keyboard.nextLine();
// System.out.println("Please indicate if the employee in question is classified
// as either Staff or Manager.");
// System.out.println("Please enter the number of hours worked by the
// employee.");
// System.out.println("Please enter the number of hours worked by the
// employee.");
// if classification = staff {
// break;
// String str = keyboard.nextLine().toLowerCase();

// Is the employee in question classified as Staff or Manager staff
// at edu.unlv.mis768.labwork11.PayrollDemo.main(PayrollDemo.java:16)