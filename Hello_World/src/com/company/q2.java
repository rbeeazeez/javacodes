package com.company;

import java.util.Scanner;
public class q2 {
    public static void main (String[]args){
        Scanner robiat = new Scanner(System.in);
        double num1, num2, addition, subtraction, multiplication, division;
        System.out.println("Enter the first number: ");
        num1 = robiat.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = robiat.nextDouble();
        addition = num1 + num2;
        subtraction = num1 - num2;
        multiplication = num1 * num2;
        division = num1 / num2;
        System.out.println("sum of numbers = " + addition);
        System.out.println("subtraction of numbers = " + subtraction);
        System.out.println("product of numbers = " + multiplication);
        System.out.println("division of numbers = " + division);



    }
}
