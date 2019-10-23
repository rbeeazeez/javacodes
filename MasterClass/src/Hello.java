public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello Robiat");
        int myMaxNumber = Integer.MAX_VALUE;
        int myMinNUmber = Integer.MIN_VALUE;
        System.out.println("Maximum number = " + myMaxNumber);

        int myIntValue = 5;
        double myDoubleValue = 5d;
        float myFloatValue = 5f;

        System.out.println("My Integer Value= " + myIntValue);
        System.out.println("My double value= " + myDoubleValue);
        System.out.println("My float value= " + myFloatValue);

        int myPound = 20;
        double toKilogram = (double) myPound * 0.45359237;
        System.out.println("20 pounds to kilograms equals = " + toKilogram);

        char myUnicodeChar = '\u0045';
        System.out.println(myUnicodeChar);
        System.out.println("\u00A9 2019");

        int result = 10;
        result += 2;
        System.out.println(result);

        boolean isRobiat = true;
        if (isRobiat == false) {
            System.out.println("How are you today Robiat");
        } else {
            System.out.println("Where are you?");
        }

        double firstNum = 20.00;
        double secondNum = 80.00;
        double sumOfNum = firstNum + secondNum;
        System.out.println("Sum of my numbers = " + sumOfNum);
        double multiplyNum = sumOfNum * 100.00;
        double remainder = multiplyNum % 40.00;

        boolean isRemainder = true;
        if (remainder == 0) {
            System.out.println("No remainder left");
        }

        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

//        boolean gameOver = true;
//        int score = 10000;
//        int levelCompleted = 8;
//        int bonus = 200;
//
//        if(gameOver){
//            int finalScore = score + (levelCompleted*bonus);
//            System.out.println("Your final score is " + finalScore);
//        }

        calculateFinalScore(true, 800, 5, 100);
        calculateFinalScore(true, 10000, 8, 200);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Robiat ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Zainab ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Tosin ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Bolu ", highScorePosition);

        checkNumber(0);
        checkNumber(-10);
        calcFeetAndInchesToCentimeters(9,0 );
        calcFeetAndInchesToCentimeters(100);
        System.out.println(getDurationString(70, 50));;
        System.out.println(getDurationString(80));
    }

    //learning how to create methods
    //creating a method with void means it does not return any value
//    public static void calculateFinalScore(boolean gameOver,int score,int levelCompleted,int bonus) {
//        if(gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 2000;
//            System.out.println("Your final score is " + finalScore);
//        }

    // the method type is declared when returning a value
    public static int calculateFinalScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }


    public static void displayHighScorePosition(String nameOfPlayer, int highScorePosition) {
        System.out.print(nameOfPlayer + "managed to get into position ");
        System.out.println(highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000){
//            return 1;
//        }else if(playerScore >= 500 ){
//            return 2;
//        }else if (playerScore >= 100 ){
//            return 3;
//        }else {
//            return 4;
//        }
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
    //multiple return statements are not a good way to write code, the above is re written


    public static void checkNumber(int number) {
        //String value = "zero";
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("zero");
        }
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;

        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches= " + centimeters+" cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 3;
        System.out.println(inches + "inches is equal to " + feet + "feet and " + remainingInches + "inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(int minutes, int seconds){
        if((minutes < 0) || (seconds < 0) || (seconds > 59)){
            return "invalid value";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        return hours + "h" + remainingMinutes + "m" + seconds + "s";
    }
    public static String getDurationString(int seconds){
        if (seconds < 0){
            return "invalid value";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "second(s) equals " + minutes + "m and " + remainingSeconds + "s");
        return getDurationString(minutes, remainingSeconds);

    }
//    public static void printYearsAndDays(long minutes){
//        if(minutes < 0){
//            System.out.println("Invalid value");
//        }else {
//            long Years = (int) minutes \ 525600;
//
//        }
//    }
}





