import java.util.Scanner;

public class CombinationAndPermutation {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in) ;
        System.out.println ("Enter value for n: ");
        int n = input.nextInt ();
        System.out.println ("Enter value for r: ");
        int r = input.nextInt ();
        double combination = permutation (n, r)/factorial (r);
        System.out.println (combination);

    }

    public static double factorial(int number){
        int a = 1;
        for (int i=1; i <= number; i++){
            a = a*i;
        }return a;
    }

    public static double permutation(int n, int r){
        double difference = factorial (n-r);
        double perm = factorial (n);
        double answer = perm/difference;
        return answer;
    }

}
