package mis768unlv;

public class Employee {
	// Fields
	private String name; // name of the employee
	private int experiencePoint; // experience value of the employee
	
	// constants
	final double BASE_PAY = 25;  // the base pay rate
	final double REGULAR_HOURS = 40; // the regular working hours
	
	/* Constructor 
	 * set the default value for experience point*/
	public Employee() {
		experiencePoint = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperiencePoint() {
		return experiencePoint;
	}

	// add a certain number of points to the experience point
	public boolean earnExperiencePoint(int numOfPoints) {
		if(numOfPoints <0)
			return false;
		else {
			experiencePoint+= numOfPoints;
			return true;
			
		}
			
		
	}
	
	// calculate salary based on the number of hours given.
	public double calcSalary(int numOfHours) {
		double salary = numOfHours * BASE_PAY;
		if(numOfHours > REGULAR_HOURS)
			salary+= (numOfHours-REGULAR_HOURS) * BASE_PAY * .8;
		// a simplified formula. We will revise it when we talk about if-else statement
		// double salary = REGULAR_HOURS * BASE_PAY + (numOfHours-REGULAR_HOURS)*BASE_PAY*1.8;
		return salary;
	}
	public boolean getBonusQualification(int numOfHours) {
		
		if(numOfHours > REGULAR_HOURS && experiencePoint >200)
			return true;
		else
			return false;
		
	}

}
/*

I don't know what it is, but I am so super tired right now. I wanted to get this second assignment done.

...

this might actually be easier than I was worried about.

*/
