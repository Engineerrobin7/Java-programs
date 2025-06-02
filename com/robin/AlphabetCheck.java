package com.robin;
import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter a character: ");
            char ch = in.next().trim().charAt(0);
            if (ch >= 'a' && ch <= 'z') {
                System.out.println("Lowercase");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println("Uppercase");
            } else {
                System.out.println("Not an alphabet character");
            }
        }
    }
}
