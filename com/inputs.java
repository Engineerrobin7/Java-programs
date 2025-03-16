package com;

import java.util.Scanner;

public class inputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter 1st number: ");
            int number1 = scanner.nextInt();
            System.out.println("You entered: " + number1);

            System.out.println("Enter 2nd number: ");
            int number2 = scanner.nextInt();
            System.out.println("You entered: " + number2);

            int sum = number1 + number2;
            System.out.println("Sum of two numbers: " + sum);
        } finally {
            scanner.close();
        }
    }
}
