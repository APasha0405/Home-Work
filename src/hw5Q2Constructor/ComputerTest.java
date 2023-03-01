package hw5Q2Constructor;
public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
        Computer computer3 = new Computer("Dell", "Inspiron", "Windows 10", 600, 'B', true);
        System.out.println("My Brand: " + computer3.brand + ", Model: " + computer3.model + ", "
        + "Operating system: " + computer3.operatingSystem + ", Price: $" + computer3.price + ", Grade: " 
        + computer3.grade + " and Made in the USA? Ans: " + computer3.madeInUSA + ".");
    }
}