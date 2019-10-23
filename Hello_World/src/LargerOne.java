//A simple program to check for a larger number between two numbers

import java.util.Scanner;
public class LargerOne {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        if(num1>num2){
            System.out.println(num1 + " is the larger number");
        }else if(num2>num1){
            System.out.println(num2 + " is the larger number");
        }else if(num1 == num2){
            System.out.println(num1 + " and " + num2 + " are equal");
        }else{
            System.out.println("Try again");
        }
    }
}
