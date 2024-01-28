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

from MIS 764 annotations to notes

It was by pure chance that I took module 3 to work on, or it wasn’t pure chance, but it wasn’t exactly a deliberate decision.

It was more that it was due module 3 is due way off in april, it was the assignment that was due later on.

So I didn’t end up working on the references page first. I actually started with the outline

I have to put this aside for now and work on my MIS 768 Assignments

Module 3: IT-Enabled Innovation 

3.1. The Relation between IT and Organizational Innovation 
The role of IT in organizational innovation – A systematic literature review 
The nonlinear influence of harmonious information technology affordance on organisational innovation 
ChatterjeeMoodyLowryChakrabortyHardinJMIS2015.pdf Attachment 
ChatterjeeMoodyLowryChakrabortyHardinJSIS2020.pdf Context 

3.2 Module Sub Header. 
Disruptive innovations with IT Attachment 
Disruptive_ nnovation Conceptual Foundations
INFORM~1.PDF Attachment 
INFORM~2.PDF Attachment 
The Disruptive Nature of Information Technology Innovations_ The.pdf Context 

3.3 Module Sub Header. 
Innovating with Artificial Intelligence 
Special Issue Editorial_ Artificial Intelligence in Organizations.pdf 
AI Innovation Typology.pdf 
AI Multidisciplinary Perspectives.pdf Attachment Strategic use of AI.pdf

References








Annotations





Module 1 vicky
Module 2 kelly
Module 3 kenneth
Module 4 group
Subsection 4.3 group
4.3.1 Digital Innovation Review vicky
4.3.2 Unpacking the Difference kelly
4.3.3 Digital opportunities for incumbents Kenneth
4.3.4 Digitalization Ethical Challenge Kenneth




*/
