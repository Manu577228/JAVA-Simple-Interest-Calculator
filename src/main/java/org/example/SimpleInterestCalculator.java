package org.example;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter principal amount
        System.out.println("enter principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt user to enter annual interest rate
        System.out.println("Enter annual rate (in %): ");
        double rate = scanner.nextDouble();

        // Prompt the user to enter time period in years
        System.out.println("Enter time period in years: ");
        double time = scanner.nextDouble();

        // Calculate the simple interest
        double interest = (principal * rate * time) / 100; // Formal for simple Interest

        // Display the calculated simple Interest
        System.out.println("Simple Interest: " + interest);

        scanner.close();
    }
}
