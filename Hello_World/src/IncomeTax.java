import java.util.Scanner;
public class IncomeTax{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = input.nextInt();
        System.out.println("Enter gender: ");
        String gender = input.next();
        System.out.println("Enter taxable income: ");
        int income = input.nextInt();
    }
}
