import java.util.*;

public class MainForBanking {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Choose an option from below: ");
        int choose = input.nextInt ();

        System.out.println ("Pick 1 to open an account");
        System.out.println ("Pick 2 to deposit");
        System.out.println ("Pick 3 to withdraw");

        switch (choose) {
            case 1:
                System.out.println ("Provide your name, phonenumber and email address: ");
                break;
            case 2:

        }

    }
}
