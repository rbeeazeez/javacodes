//A simple calculator programme
import java.util.Scanner;
public class MenuProcessing {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int num1, num2, choose;
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("-- Calculator Menu --");
        System.out.println("0. Quit");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Multiply two numbers");
        System.out.println("4. Divide two numbers");
        System.out.println("***********************************");
        System.out.println("Choose an option");
        choose = input.nextInt();
        if(choose == 0){
            System.out.println("");
        }else if(choose == 1){
            int answer = num1 + num2;
            System.out.println(answer);
        }else if(choose == 2){
            int answer = num1 - num2;
            System.out.println(answer);
        }else if(choose == 3){
            int answer = num1 * num2;
            System.out.println(answer);
        }else if(choose == 4){
            double answer = (double)num1 / num2;
            System.out.println(answer);
        }else{
            System.out.println("You did not pick from available options ");
        }



    }
}
