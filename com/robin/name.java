package com.robin;

import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
        }
    }
}