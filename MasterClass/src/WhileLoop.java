public class WhileLoop {
    public static void main (String[] args){

//        System.out.println (isEvenNumber (2));
//        int count = 1;
//        while (count != 6){
//            System.out.println ("count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while(true) {
//            if (count == 6){
//                break; //loop terminates when the value of count equals 6
//            }
//            System.out.println ("count value is " + count);
//            count++;
//        }


//        int  number = 4;
//        int finishNumber = 20;
//        while(number <= finishNumber){
//            number++;
//            if (!isEvenNumber (number)){
//                continue;
//            }
//            System.out.println ("Even number " + number);
//        }
        int sum = 0;
        int count = 0;

        int  number = 4;
        int finishNumber = 20;
        while(number <= finishNumber){
            number++;
            if (!isEvenNumber (number)){
                continue;
            }
            count++;
            if (count == 5){
                break;
            }
            System.out.println ("Even number " + number);
        }
        System.out.println ("Total numbers found = " + count);
    }

    public  static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
