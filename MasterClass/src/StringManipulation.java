import java.util.Arrays;
import java.util.*;

public class StringManipulation {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter a word: ");
        String word = input.nextLine ();

        String whatToFind = "the";
        if (word.indexOf (whatToFind) != -1){
            System.out.println ("Found the word " + whatToFind);
        }else{
            System.out.println ("Can't find the word ");
        }


        //changing the word to a character array
        char myWord[] = word.toCharArray ();
        for (int i = 0; i < myWord.length; i++) {
            System.out.println (myWord[i]);
        }

        String arrayA[] = {"1", "2", "3"};
        String arrayB[] = {"2", "5", "6"};
        String arrayC[] = new String[6];

        for (int i = 0; i < arrayA.length; i++){
            arrayC[i] = arrayA[i];
        }

        int a = 0;
        for (int i = arrayA.length; i < arrayC.length; i++){
            arrayC[i] = arrayB[a];
            a++;
        }

        for (int i = 0;i<arrayC.length; i++){
            System.out.print(arrayC[i]);
        }


    }
}
