package com.robin;

import java.util.Scanner;

public class largestnumber {
    public static void main(String[] args) {
        int max;
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            int a = in.nextInt();
            System.out.print("Enter the second number: ");
            int b = in.nextInt();
            System.out.print("Enter the third number: ");
            int c = in.nextInt();

            max = a;
            if (b > max) {
                max = b;
            }

            if (c > max) {
                max = c;
            }
        }

        System.out.println("The largest number is: " + max);
    }
}
