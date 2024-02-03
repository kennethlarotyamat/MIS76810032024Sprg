package edu.unlv.mis.kly.w3;

public class NestedLoopsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Simulate the clock
		for (int hours = 1; hours<= 12; hours++) {
			for (int minutes = 0; minutes <=59; minutes++) {
				for (int seconds = 0; seconds<= 59; seconds++) {
					System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
				}
			}
		}

	}

}
