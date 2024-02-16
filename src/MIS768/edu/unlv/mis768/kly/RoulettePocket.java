package edu.unlv.mis768.kly;

public class RoulettePocket {
	// fields
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int num) {
		this.number = num;
	}
	public String getColor() {
		//Static is only used for the controller class 
		//model class do not use static
		String color = "green";
		// 1-10 19-28
		if ((number>=1 && number<=10) || (number >=19 && number <=20)) {
			if(number %2 ==0) // even numbers
				color = "black";
			else
				color ="red";
		} else if ((number>=11 && number <=18) || (number>=29 && number <=36)) {
			if (number % 2 ==0)
				color ="red";
			else
				color = "black";
		}
		
		return color;
	}

}
