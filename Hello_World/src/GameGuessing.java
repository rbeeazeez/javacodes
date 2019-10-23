//A game application that makes a user to guess the right number
import java.util.Random;
import java.util.Scanner;

public class GameGuessing {
    public static void main(String[] args) {
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        int RandomNum = generator.nextInt(100);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Guess the number, it is between 0 and 100 inclusive: ");
            int GuessNum = input.nextInt();
            if (RandomNum > GuessNum) {
                System.out.println("Your guess is too low,please try again.You have " + (10 - i) + " attempts left");
            } else if (RandomNum < GuessNum) {
                System.out.println("Your guess is too high,please try again.You have " + (10 - i) + " attempts left");
            } else {
                System.out.println("You have guessed right in " + i + " attempt(s)");
                break;
            }
            if(i == 10){
                System.out.println("You have picked out of range");
            }
        }
    }
}