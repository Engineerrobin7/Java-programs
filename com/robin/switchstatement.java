package com.robin;
import java.util.Scanner;

public class switchstatement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a fruit name:");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Sweety and Bitter");
                break;
            default:
                System.out.println("Please Enter a valid fruit");
        }

        in.close();
    }
}