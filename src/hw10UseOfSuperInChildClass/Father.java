package hw10UseOfSuperInChildClass;

//Father class
class Father {
 String Name, sex, FamilyName;
 int age, usCitizen;
 
 // default constructor
 Father() {
     System.out.println("This is from the default constructor of Father class");
 }
 
 // parameterized constructor
 Father(String Name, int age, String sex, int usCitizen, String FamilyName) {
     this.Name = Name;
     this.age = age;
     this.sex = sex;
     this.usCitizen = usCitizen;
     this.FamilyName = FamilyName;
     System.out.println("Father's Information: Name: " + this.Name + ", Age: " + this.age + ", Sex: " + this.sex + ", US Citizen: " + this.usCitizen + ", Family Name: " + this.FamilyName);
 }
 
 // regular void method
 void father() {
     System.out.println("This is from father() method");
 }
 
 // parameterized method
 void fatherInfo() {
     System.out.println("Father's Information: Name: " + this.Name + ", Age: " + this.age + ", Sex: " + this.sex + ", US Citizen: " + this.usCitizen + ", Family Name: " + this.FamilyName);
 }
}

//Daughter class
class Daughter extends Father {
 int birthMonth, age;
 
 // default constructor
 Daughter() {
     System.out.println("This is from the default constructor of Daughter class");
 }
 
 // parameterized constructor
 Daughter(String Name, int age, String sex, int usCitizen, String FamilyName, int birthMonth, int age2) {
     super(Name, age, sex, usCitizen, FamilyName);
     this.birthMonth = birthMonth;
     this.age = age2;
     System.out.println("Daughter's Information: Birth Month: " + this.birthMonth + ", Age: " + this.age);
 }
 
 // regular void method
 void daughter() {
     System.out.println("This is from daughter() method");
 }
 
 // parameterized method
 void daughterInfo() {
     System.out.println("Daughter's Information: Birth Month: " + this.birthMonth + ", Age: " + this.age);
 }
}

//TestFamily class
class TestFamily {
 public static void main(String[] args) {
     Daughter daughter = new Daughter("Jane", 30, "Female", 1, "Smith", 12, 20);
     daughter.father();
     daughter.daughter();
     daughter.fatherInfo();
     daughter.daughterInfo();
 }
}