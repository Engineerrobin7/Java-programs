package com.robin;
import java.util.Scanner;
public class Calculator {
    Scanner in = new Scanner (System.in);
    int ans= 0;
    while(true){
        System.out.println("Enter the operator:");
        char op = in.next().trim().charAt(0);

        if(op =='+'||op =='-'||op =='*'||op=='/'||op=='%'){
            System.out.println("Enter two number:");
            int num1=in.nextInt();
            int num2=in.nextInt();

            if (op=='+'){

            }
        }
    } 
    
}
