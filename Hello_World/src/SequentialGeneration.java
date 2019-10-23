import java.util.Scanner;
public class SequentialGeneration {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int nthTerm;
        System.out.println("Please provide the number of terms to print out(a positive integer): ");
        nthTerm = input.nextInt();
        int firstTerm = 1;
        int startMultiply = 1;
        for(int i=1; i<=nthTerm; i++){
            firstTerm = firstTerm * startMultiply;
            startMultiply += 2;
            System.out.println(firstTerm);
        }
    }
}
