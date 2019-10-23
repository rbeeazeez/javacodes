import java.util.Scanner;
//this programme finds the sum, mean and the maximum number of two numbers using the concept of oop
public class Mathematics {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number");
        int number1 = input.nextInt();
        System.out.println("Enter the second number");
        int number2 = input.nextInt();

    }

    //method to calculate sum
    static double sum(int a, int b){
        return a+b;
    }

    //method to calculate mean
    static double mean(int a, int b){
        int add = (int) sum(a,b); //calling the sum method
        double average = add/2.0;
        return average;
    }

    static int maximum(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
