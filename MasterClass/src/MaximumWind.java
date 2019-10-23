public class MaximumWind {
    public static void main(String[] args) {

        int[][] windValues = {{45, 67, 75, 76, 45}, {60, 69, 59, 40, 47}, {79, 58, 60, 32, 57},
                {56, 34, 70, 36, 49}};
        System.out.println (findLargest (windValues));

        int max = findLargest (windValues);
        for (int i = 0; i < windValues.length; i++) {
            for (int j = 0; j < windValues[i].length; j++) {
                if (windValues[i][j] == max) {
                    int date = j + 1;
                    String day = null;
                    switch (date) {
                        case 1:
                            day = "Monday";
                            break;
                        case 2:
                            day = "Tuesday";
                            break;
                        case 3:
                            day = "Wednesday";
                            break;
                        case 4:
                            day = "Thursday";
                            break;
                        case 5:
                            day = "Friday";
                            break;
                    }
                    System.out.println ("The maximum stuff was recorded on " + day + " in week " + (i + 1));
                }
            }
        }
    }

    public static int findLargest(int[][] myValues) {
        int max = myValues[0][0];
        for (int i = 0; i < myValues.length; i++) {
            for (int j = 0; j < myValues[i].length; j++) {
                if (max < myValues[i][j]) {
                    max = myValues[i][j];
                }
            }
        }
        return max;
    }

}
