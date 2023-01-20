package hw4JavaVariables;

public class AboutMeTest {
	public static void main(String[] args) {
		AboutMe pasha = new AboutMe(); // Constructor initialized
		pasha.name = "Abdul Pasha";
		pasha.sex = 'M';
		pasha.age = 100;
		pasha.myHeight = 5.52548f;
		pasha.usCitizen = true;
		pasha.myYearlySalary = 1587525498;
		pasha.myApartmentRent = 15725;
		pasha.myBankBalance = 5245875254854458455l;
		pasha.myGrade = 3.4584254852245485;
		pasha.aboutMe(); // Method initialized

		System.out.println("\n-------------------------------------------------\n");

		AboutMe alex = new AboutMe();
		alex.name = "Alex";
		alex.sex = 'M';
		alex.age = 35;
		alex.myHeight = 6.15875f;
		alex.usCitizen = false;
		alex.myYearlySalary = 175235874;
		alex.myApartmentRent = 24587;
		alex.myBankBalance = 1257875254854458455l;
		alex.myGrade = 4.4584254852245485;
		alex.aboutMe();
	}

}
