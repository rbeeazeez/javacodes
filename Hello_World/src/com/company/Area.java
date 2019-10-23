package com.company;

import java.util.Scanner;
class Area{
    public static void main(String [] args){
        Scanner robiat = new Scanner(System.in);
        double length, breadth, area;
        System.out.println("Enter the length");
        length = robiat.nextDouble();
        System.out.println("Enter the breadth");
        breadth = robiat.nextDouble();
        area = length * breadth;
        System.out.println("Total area = " + area);
    }
}