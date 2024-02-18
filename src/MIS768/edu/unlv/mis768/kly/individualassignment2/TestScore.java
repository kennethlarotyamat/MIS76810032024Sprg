package edu.unlv.mis768.kly.individualassignment2;

public class TestScore {
	

	
	private int numQuestions;
	private int numMissed;
	

	public TestScore( int numQ) {
		
	}
	public int getNumQuestions() {
		return numQuestions;
	}
	public void setNumMissed (int numMissed) {
		
	}
	public int getNumMissed() {
	return numMissed;
	}
	

	public double getPointsEach() {
		

	double questionValue = numQuestions/100;
	return questionValue;
	}
	
	

	
	
	


//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String
	

}

// i just took a survey from visual studio code, and it asked me how i liked developing java in visual studio code,
// and i wrote that i just really don't even use vs code for java because I really don't know how.

// I guess this wasn't too bad, I was worried at first

//	double questionValue = 0;
//+getPoints Each(): double
//The getPointsEach() method will determine how many points for each question. 
//Assume the test is 100 points and each question accounts for the same points. 
//Thus, this method will calculate the points for each question, and return a double number.

////+getPoints Each(): double
//public double getPointsEach() {
//return numMissed;
//}

//+getNumMissed(): int

//public int getNumMissed() {
//	return NumMissed;
//}



//+setNumMissed (numMissed: int): void


//public void setInterestRate(double iRate) { // public void setInterestRate(double interestRate) {
//	// this.interestRate = interestRate;
//	if(iRate<0)
//		iRate=0;
//	else if(iRate>.01)
//		iRate /=100;
//	interestRate=iRate;
//}



//+getNumQuestions(): int
//public double getBalance() {
//	return balance;
//}





//+TestScore(numQ: int)
//+TestScore(numQ: int)

//+Test(numQ: int)

//-numQuestions: int
//-numMissed: int

//public SavingsAccount(String iRateString, String balString) { //method overload to string// public SavingsAccount(double iRate, double bal) {
//	
//	//		+SavingsAccount()
//	//		+SavingsAccount(iRate: double, bal: double) 
//	//		+SavingsAccount(iRateStr: String, balString: String)
//	// The constructor SavingsAccount(String, String) is undefined
//    double iRate = Double.parseDouble(iRateString);
//    double bal = Double.parseDouble(balString);	
//if(bal<0)
//	bal=0;
//
//balance = bal;
//
//if(iRate<0)
//	iRate=0;
//else if(iRate>.01)
//	iRate /=100;
//interestRate=iRate; // Type mismatch: cannot convert from String to double
//}

//-numQuestions: int
//-numMissed: int

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String


	// private with negative sign
//-numQuestions: int
//-numMissed: int
	// public with positive sign

//+Test(numQ: int)
//+getNumQuestions(): int
//+setNumMissed (numMissed: int): void
//+getNumMissed(): int
//+getPoints Each(): double
//+getScore(): double
//+equals(test2: Test): boolean
//+toString(): String

//I still don't understand this whole - two different files kind of thing
//all I know is that I have to put some things in one file, and a bunch of
//other things in some other file.
//so I have a TestScore.java - and a TestScoreDemo.java

//	-numQuestions: int
//	-numMissed: int

//	+Test(numQ: int)
//	+getNumQuestions(): int
//	+setNumMissed (numMissed: int): void
//	+getNumMissed(): int
//	+getPoints Each(): double
//	+getScore(): double
//	+equals(test2: Test): boolean
//	+toString(): String