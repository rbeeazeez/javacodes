public class NumberOfDaysInMonth {
    public static void main(String[] args) {

        System.out.println (getDaysInMonth (4, 2020));

        for (int i = 2; i < 9; i++) {
            System.out.println(calculateInterest (10000, i));
        }
        for (int i = 8; i > 1; i--){
            System.out.println ("The interest on 10000 at " + i + "is " +
        (calculateInterest (10000, i)));
        }

        }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        if (isLeapYear (year) && month == 2) {
            return 29;
        }
        int day;
        switch (month) {
            case 1:
                day = 31;
                break;
            case 2:
                day = 28;
                break;
            case 3:
                day = 31;
                break;
            case 4:
                day = 30;
                break;
            case 5:
                day = 31;
                break;
            default:
                day = -1;
                break;
        }
        return day;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

}
