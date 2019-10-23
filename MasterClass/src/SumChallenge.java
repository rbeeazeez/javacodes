public class SumChallenge {
    public static void main(String[] args) {

        System.out.println (sumOdd (1, 10));

//        int sum = 0;
//        int count = 0;
//
//        for (int i = 1; i <= 1000; i++) {
//            if ((i % 3 == 0) && (i % 5 == 0)) {
//                count++;
//                sum += i;
//                System.out.println ("Found number " + i);
//
//            }
//            if (count == 5){
//                break;
//            }
//        }
//        System.out.println ("Sum of numbers divisible by 3 and 5 within the range of 1 to 1000 " +
//                "inclusive is " + sum);
    }

    public static boolean isOdd(int number){
        if (number < 0 || number % 2 == 0){
            return false;
        }
        return true;
    }

    public static int sumOdd(int start, int end){
        if ((start > end) || (start < 0 || end < 0)){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isOdd (i)){
                sum += i;
            }
        }
        return sum;
    }
}
