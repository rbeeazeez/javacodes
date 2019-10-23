//import javax.swing.JOptionPane;
//import java.util.Scanner;
//
//public class EncodeDecode<lengthOfString> {
//    static Scanner input = new Scanner(System.in);
//    static String encodedString = "";
//    static String testString;
//    static int lengthOfString, lengthOfSubstring;
//    static char[] stringCharacterArr;
//    static char[] firstArr, secondArr;
//    static char temp;
//
//    public static void main(String[]args){
//        String message = " Your input must not be less than 10 characters!"; // displaying instruction to user
//        testString = JOptionPane.showInputDialog("Enter a sentence\n" + message);
//
//        //testing length of string
//       // while(true){
//            if(testString.length() <10){
//                testString = JOptionPane.showInputDialog("Enter a sentence\n" + message);
//            }else{
//                break;
//            }
//        }
//
//        lengthOfString = testString.length();
//        if(lengthOfString % 2 ==0){
//            encodeStringType1();
//        }else{
//            encodeStringType2();
//        }
//    }
//    static void encodeStringType1() {
//        lengthOfSubstring = lengthOfString / 2;
//
//        //converting the string to character array
//        stringCharacterArr = testString.toCharArray();
//
//        //changing the first half of the string to a character array
//        firstArr = new char[lengthOfSubstring];
//        for(int i = 0; i < lengthOfSubstring; i++){
//            firstArr[i] = testString.charAt(i);
//
//        }
//
//        //changing the second half of the string to a character array
//        secondArr = new char[lengthOfSubstring];
//        int j = 0;
//        for (int j = 0; j < lengthOfSubstring; j++);
//        {
//            secondArr[j] = testString.charAt(j);
//            j += 1;
//        }
//
//        //swapping even characters positions with odd character positions
//        for(int i = 1; i <firstArr.length; i++){
//            if(i % 2 == 1){
//                temp = firstArr[i]; // store the odd positions of the first character array in a temporary variable
//                firstArr[i] = secondArr[i - 1];//swap the even positions of the second array with the odd
//                                                    // position of the first array
//                temp = secondArr[i - 1];//swap the even positions with the temp variable
//            }
//        }
//
//        for (int k = 0; k < secondArr.length; k++){
//            encodedString += secondArr[k]; //add the second half of string to the encoded string
//        }
//
//        for (int n = 0; n <firstArr.length; n++){
//            encodedString += firstArr[n]; //add the first half of string to the encoded string
//        }
//        System.out.println("The encoded string is : " + encodedString);
//    }
//
//    static void encodeStringType2(){
//        lengthOfSubstring = lengthOfString / 2;
//
//        //converting the string to character array
//        stringCharacterArr = testString.toCharArray();
//
//        //changing the first half of the string to a character array
//        firstArr = new char[lengthOfSubstring];
//        for(int i = 0; i < lengthOfSubstring; i++){
//            firstArr[i] = testString.charAt(i);
//
//        }
//
//        //changing the second half of the string to a character array
//        secondArr = new char[lengthOfSubstring];
//        int j = 0;
//        for (int i = lengthOfSubstring; i < lengthOfString; i++) {
//            ;
//        }
//        {
//           secondArr[j] = testString.charAt(j);
//            j += 1;
//        }
//
//        //swapping even characters positions with odd character positions
//        for(int i = 1; i <firstArr.length; i++){
//            if(i % 2 == 1){
//                temp = firstArr[i]; // store the odd positions of the first character array in a temporary variable
//                firstArr[i] = secondArr[i - 1];//swap the even positions of the second array with the odd
//                // position of the first array
//                temp = secondArr[i - 1];//swap the even positions with the temp variable
//            }
//        }
//
//        for (int k = 0; k < secondArr.length; k++){
//            encodedString += secondArr[k]; //add the second half of string to the encoded string
//        }
//
//        for (int n = 0; n <firstArr.length; n++){
//            encodedString += firstArr[n]; //add the first half of string to the encoded string
//        }
//        System.out.println("The encoded string is : " + encodedString);
//    }
//}
