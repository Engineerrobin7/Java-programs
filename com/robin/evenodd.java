package com.robin;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("The number is even.");
            } else {
                System.out.println("The number is odd.");
            }
        }
    }
}
