package com.robin;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        /*  Syntax of for loops;
        
        for(initialization; condition; increment/decrement){

            // body 
        }
        */
        
        // Q. Print Number from 1 to 5

        for (int num=1; num<=5; num+=1){
            System.out.println(num);  
        }

        //Q. Print number 1 to n 

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();

            for (int num=1; num<=n; num+=1){
                System.out.println(num);  
            }
        }

        //while loops

        /*
         Syntax:-

         while(condition){
            //body 
         }
         */

         int num = 1;
            while(num<=5){
                System.out.println(num);
                num+=1;
            }
    }
}
