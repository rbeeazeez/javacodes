import java.util.Scanner;
public class Factorial {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("This programme finds the factorial of the number you input");
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int i = 1;
        int factorial = 1;
        for(i=1; i<=number; i++){
            factorial=factorial*i;
        }//close for loop
        System.out.println("Factorial = " + factorial);
    }
}
