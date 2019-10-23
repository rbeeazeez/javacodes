public class SumDigits {

    public static void main (String [] args){

        System.out.println ("The sum of the digits in number 125 is "+ sumDigits (125));
        System.out.println ("The sum of the digits in number -130 is "+ sumDigits (-130));
        System.out.println ("The sum of the digits in number 4 is "+ sumDigits (4));
        System.out.println ("The sum of the digits in number 53125 is "+ sumDigits (53125));
    }

    //method to sum individual digits of a number passed to it
    public static int sumDigits(int number) {
        if (number < 10){
            return -1;
        }

        int sum = 0;

        // 136 -> 136/10 = 13 -> 13*10 = 130 -> 136-130 = 6
        while (number>0) {
            // extract the least significant bit
            int digit = number % 10;
            sum += digit;

            number /= 10;

        }
        return sum;
    }
}
