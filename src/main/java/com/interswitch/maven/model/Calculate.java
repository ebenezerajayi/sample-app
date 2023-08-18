package com.interswitch.maven.model;

import java.util.Scanner;

public class Calculate {
    Scanner scanner = new Scanner(System.in);
    public void addNumbers(){
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();
        int sum = x + y;
        System.out.println("Addition of both numbers is: " + sum);
    }
    public void subtractNumbers(){
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();
        int sub = x - y;
        System.out.println("Subtraction of both numbers is: " + sub);
    }

    public void multiplyNumbers(){
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();
        int mul = x * y;
        System.out.println("Multiplication of both numbers is: " + mul);
    }
    public void divideNumbers(){
        System.out.println("Enter the first number");
        int x = scanner.nextInt();
        System.out.println("Enter the second number");
        int y = scanner.nextInt();
        int div = x / y;
        System.out.println("Division of both numbers is: " + div);
    }
}
