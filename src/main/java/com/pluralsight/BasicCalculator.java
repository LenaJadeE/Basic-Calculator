package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Step 1:
// Multiply the two numbers and display the results and equation
    System.out.println("Enter the first number: ");
    int firstNumber = scanner.nextInt();

    System.out.println("Enter the second number: ");
    int secondNumber = scanner.nextInt();

    // The menu of my possible calculation formulas
    System.out.println("Possible calculations:");
    System.out.println("(A)dd");
    System.out.println("(S)ubtract");
    System.out.println("(M)ultiply");
    System.out.println("(D)ivide");

    System.out.println("Please select an option: ");
    String selectedOption = scanner.next();

    //  I am removing the selected option to only multiply
    int product = firstNumber * secondNumber;

    System.out.println(firstNumber + " * " + secondNumber + " = " + product);

    scanner.close();

// Step 2:
// Ensure all your changes are committed and pushed to GitHub


    }
}