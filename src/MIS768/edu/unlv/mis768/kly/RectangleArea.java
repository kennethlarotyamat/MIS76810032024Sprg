package edu.unlv.mis768.kly;

import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
	private double width;
	private double length;

	public RectangleArea() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter the length of the rectangle: ");
		this.length = keyboard.nextDouble();
		System.out.print("Please enter the width of the rectangle: ");
		this.width = keyboard.nextDouble();

		System.out.println("The area of the rectangle is: " + getArea());
		keyboard.close();
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;

	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return width * length;
	}
	}

	public void displayArea() {
		// TODO Auto-generated method stub
		
	}
}

//double length = keyboard.nextInt();
//System.out.print("Please enter the length of the rectangle: ");
//this.length = keyboard.nextDouble(); 											
//System.out.print("Please enter the width of the rectangle: ");
//this.width = keyboard.nextDouble();