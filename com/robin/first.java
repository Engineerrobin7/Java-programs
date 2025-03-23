package com.robin;

import java.util.Scanner;

public class first{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of Circle");
        float radius=in.nextFloat();
        double pie=3.14;
        double result= pie*radius*radius;

        System.out.println(result);
    }

}
