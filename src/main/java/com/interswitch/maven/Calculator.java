package com.interswitch.maven;
import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Eben-Calculator!");

            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");

            int operation = scanner.nextInt();
            double result = 0.0;

            switch (operation) {
                case 1:
                    result = num1 + num2;
                    break;
                case 2:
                    result = num1 - num2;
                    break;
                case 3:
                    result = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Cannot divide by zero");
                        System.exit(1);
                    }
                    break;
                default:
                    System.out.println("Invalid operation");
                    System.exit(1);
            }

            System.out.println("Result: " + result);

            scanner.close();
        }
    }