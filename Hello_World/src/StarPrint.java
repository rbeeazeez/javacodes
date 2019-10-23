import java.util.Scanner;

public class StarPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to print a star pyramid: ");
        int number = input.nextInt();
        int j = 1;
        for (int i = 1; i <= number; i++) {
            for (j = i; j >= 1; j--) {
                System.out.print("*");
            }
           System.out.println("");
        }


        for(int m = number; m > 0; m--){
            int space = number - m;
            for(int n = 1; n<m; n++){
                System.out.println("");
            }
             for(int y = 0; y<space; y++){
                 System.out.println("*");
             }
            System.out.println("");
        }

    }
}

