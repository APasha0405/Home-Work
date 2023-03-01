package hw5Q3Constructor;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("John Doe", 12345, 'M', true, 90.5f);
        System.out.println("Student Name: " + student2.stName + ", ID: " + student2.stID + ", Sex: " + student2.sex + ", Grade: " + student2.grade + " and Java Programmer? Ans: " + student2.isProgrammer + ".");
    }
}