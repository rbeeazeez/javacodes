//An application that checks if a number is even or odd

import java.util.Scanner;
public class CheckNumber {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("This is an even number");
        }else if(number % 2 == 1){
            System.out.println("This is an odd number");
        }else{
            System.out.println("A wrong value is input, ensure it is an integer");
        }
    }
}
