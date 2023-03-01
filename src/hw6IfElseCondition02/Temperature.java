package hw6IfElseCondition02;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Today's Weather");
        System.out.print("Enter today's temperature: ");
        int todaysTemperature = scanner.nextInt();
        scanner.close();
        
        if (todaysTemperature < 32) {
            System.out.println("Freezing");
        } else if (todaysTemperature < 55) {
            System.out.println("Pleasant");
        } else if (todaysTemperature < 73) {
            System.out.println("Getting Warmer");
        } else if (todaysTemperature > 101) {
            System.out.println("Very Hot");
        } else {
            System.out.println("Please put a valid temperature");
        }
    }
}



