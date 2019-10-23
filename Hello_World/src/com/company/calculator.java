package com.company;

import java.util.Scanner;
public class calculator {
    public static void main (String [] args){
        Scanner robiat = new Scanner(System.in);
        double gravity = -9.81; //negative when moving up and it is in ms^2
        double FallingTime = 20;
        double InitialVelocity = 0;
        double InitialPosition = 0;
        double FinalPosition = 0;

        System.out.println("Earth's gravity = 9.81");
        System.out.println("Enter new initial velocity");
        InitialVelocity = robiat.nextDouble();
        System.out.println("Enter new initial position");
        InitialPosition = robiat.nextDouble();
    }
}
