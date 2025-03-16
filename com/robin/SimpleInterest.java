package com.robin;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the principal amount: ");
            double principal = scanner.nextDouble();

            System.out.println("Enter the rate of interest: ");
            double rate = scanner.nextDouble();

            System.out.println("Enter the time (in years): ");
            double time = scanner.nextDouble();

            double simpleInterest = (principal * rate * time) / 100;
            System.out.println("The simple interest is: " + simpleInterest);
        }
    }
}
