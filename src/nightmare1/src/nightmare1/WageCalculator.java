package nightmare1;

public class WageCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constants
		// does eclipse ide autosace how do I turn on autosave? the google instructions aren't making sense to me.		

		final double BASE_PAY = 25;
		final double REGULAR_HOURS = 40;
		
		//		declare variables
		double salary;  // salary to be calculated
		double hours = 57; // hours worked
		
		salary = (hours - REGULAR_HOURS) * BASE_PAY * 0.5 + hours * BASE_PAY;
		System.out.print("The salary is $" + salary);
		// this was originally created in eclipse IDE, but this specific comment was written in VS Code
		// I think that it makes sense that I try using both.
		// i almost want to say that it can't really hurt to use both, i'm just
		// not sure how much extra time it would take to learn both.
		// I'm already tired. I think that i have. i . well. i actually do have a group meeting
		// for my other class later today.
	}

}
