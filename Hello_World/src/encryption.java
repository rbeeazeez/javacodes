import java.util.Scanner;
public class encryption {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String word;
        System.out.println("Enter the word to be encoded: ");
        word = input.nextLine().toLowerCase();
        System.out.println("Here you have your word encrypted");
        for (int i=0; i<word.length(); i++){
            char alph = word.charAt(i);
                switch(alph){
                    case 'a':
                        alph = 'e';
                        System.out.print(alph);
                        break;
                    case 'e':
                        alph = 'i';
                        System.out.print(alph);
                        break;
                    case 'i':
                        alph = 'o';
                        System.out.print(alph);
                        break;
                    case 'o':
                        alph = 'u';
                        System.out.print(alph);
                        break;
                    case 'u':
                        alph = 'a';
                        System.out.print(alph);
                        break;
                        default:
                            System.out.print(alph);

                }
            }

    }
}

