import java.util.Scanner;
public class InterfaceDesign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        System.out.println("Hi, how much do you want to withdraw: ");
        System.out.println("The following are the amount that can be withdrawn");
        System.out.println("Enter 1 for 1000NGN");
        System.out.println("Enter 2 for 2000NGN");
        System.out.println("Enter 3 for 5000NGN");
        System.out.println("Enter 4 for 10000NGN");
        System.out.println("Enter 5 for 15000NGN");
        System.out.println("Enter 6 for 20000NGN");
        System.out.println("Enter 0 to finish transactions");
        choose = input.nextInt();
        switch(choose){
            case 1:
                System.out.println("You may have your cash");
                break;
            case 2:
                System.out.println("You may have your cash");
            case 3:
                System.out.println("You may have your cash");
            case 4:
                System.out.println("You may have your cash");
            case 5:
                System.out.println("You may have your cash");
            case 6:
                System.out.println("You may have your cash");
            case 0:
                System.out.println("Thanks for banking with us");
                break;



        }
    }
}
