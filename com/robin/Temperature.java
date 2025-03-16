package com.robin;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the Temperature in Celsius:");
            float tempC = in.nextFloat();
            float tempF = (tempC * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + tempF);
        }
    }
}
