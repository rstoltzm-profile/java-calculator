package com.example;

import java.util.Scanner;

public class MainClass {

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator App!");
        System.out.println("Choose an operation: add, subtract, multiply, divide");
        String operation = scanner.nextLine();

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        MainClass calculator = new MainClass();
        try {
            switch (operation.toLowerCase()) {
                case "add":
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case "subtract":
                    System.out.println("Result: " + calculator.subtract(num1, num2));
                    break;
                case "multiply":
                    System.out.println("Result: " + calculator.multiply(num1, num2));
                    break;
                case "divide":
                    System.out.println("Result: " + calculator.divide(num1, num2));
                    break;
                default:
                    System.out.println("Invalid operation. Please choose add, subtract, multiply, or divide.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to subtract two integers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide two integers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }
}