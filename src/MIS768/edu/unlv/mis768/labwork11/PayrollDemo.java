package edu.unlv.mis768.labwork11;

import java.util.Scanner;

public class PayrollDemo {

	private static String employee;
	private static String staff;
	private static String classification = employee;

	private static String manager;

	public static void main(String[] args) {
		boolean validInput = false;

		do {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Is the employee in question classified as Staff or Manager?");

			String str = keyboard.nextLine().toLowerCase();

			if (str.contains("staff") || str.charAt(0) == 's') {
				classification = staff;
				System.out.println("The employee has been noted to fall into the Staff Classification.");
				validInput = true;
			} else if (str.contains("manager") || str.charAt(0) == 'm') {
				classification = manager;
				System.out.println("The employee has been noted to fall into the Manager Classification.");
				validInput = true;
			} else {
				System.out.println(
						"Please indicate if the employee in question is classified as either Staff or Manager.");
			}

		} while (!validInput);
		System.out.println("Please enter the number of hours worked by the employee.");
		if (classification.equals(staff)) {

		} else if (classification.equals(manager)) {

		} else {

		}
	}
}
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