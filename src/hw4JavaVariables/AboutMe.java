package hw4JavaVariables;

public class AboutMe {
	public String name; // variable declared
	public char sex;
	public byte age;
	public float myHeight;
	public boolean usCitizen;
	public int myYearlySalary;
	public short myApartmentRent;
	public long myBankBalance;
	public double myGrade;

	public AboutMe() { // constructor declared
		System.out.println("This is all about me");
	}

	public void aboutMe() { // method implemented
		System.out.println("My Name: " + name + "\nAge: " + age + "\nSex: " + sex + "\nMy Height: " + myHeight
				+ "\nAm I US Citizen? Ans: " + usCitizen + "\nMy Yearly Salary is: " + myYearlySalary
				+ "\nMy Apartment Rent: " + myApartmentRent + "\nMy Bank Balance: " + myBankBalance + "\nMy Grade "
				+ myGrade);

	}

}
