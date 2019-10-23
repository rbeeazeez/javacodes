import java.util.Scanner;
public class CheckLeap {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Enter a year: ");
        year = input.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println("It is a leap year");
        }else{
            System.out.println("It is not a leap year");
        }

    }
}
