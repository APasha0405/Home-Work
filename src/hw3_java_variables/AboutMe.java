package hw3_java_variables;

public class AboutMe {
public String myName; // variable declared 
public String name = "Abdul Pasha"; // variable initialized 
public char sex ='M';
public byte age = 100;
public float myHeight = 5.5687557f;
public boolean usCitizen = true;
public int myYearlySalary = 1587525498;
public short myApartmentRent = 15725;
public long myBankBalance = 5245875254854458455l;
public double myGrade = 3.4584254852245485;

public static void main(String[] args) {
AboutMe aboutMe = new AboutMe();
System.out.println("My Name: " + aboutMe.name + "\nAge: " +aboutMe.age + "\nSex: " + aboutMe.sex);
}



}
