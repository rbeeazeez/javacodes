//program to calculate rank correlation

class RankCorrelation{
    public static void main (String[]args){
        int[] rainfall = new int[]{2, 2, 4, 5, 2};
        int[] temp = new int[]{3, 1, 2, 3, 1};
        int [] tempMDArray = new int[5];
        int [] rainfallMDArray = new int[5];
        int tempSum = sumArray(temp);
        System.out.println(tempSum);
        int rainSum = sumArray(rainfall);
        System.out.println(rainSum);
        double tempMean = meanArray(temp);
        System.out.println(tempMean);
        double rainMean = meanArray(rainfall);
        System.out.println(rainMean);
        subtractFromMean(rainfall, rainfallMDArray);
        subtractFromMean(temp, tempMDArray);
        printArray(tempMDArray);
        printArray(rainfallMDArray);
        double RankCorrelation = calculateSumCor(tempMDArray, rainfallMDArray)/
                Math.sqrt(calculateSumCor(tempMDArray, rainfallMDArray));
        System.out.println(RankCorrelation);
    }

    // method to sum up numbers in any array passed into it
    static int sumArray(int[] sumNumbers){
        int sum = 0;
        for(int i = 0; i<sumNumbers.length; i++){
            sum+= sumNumbers[i];
        }return sum;
    }


    // method get mean numbers in any array passed into it
    static double meanArray(int[] arrayToGetMean){
        int sumOfArray = sumArray(arrayToGetMean);
        double mean = sumOfArray/arrayToGetMean.length;
        return mean;
    }


    // method to get mean difference and store our mean difference in another array
    static void subtractFromMean(int[] arrayToSubtract, int[] putMeanDifference){
        double mean = meanArray(arrayToSubtract);
        System.out.println("Mean Differences");
        for (int n =0; n < arrayToSubtract.length; n++){
            putMeanDifference[n] = (int)Math.pow( arrayToSubtract[n] - mean , 2);
            System.out.println(Math.pow(arrayToSubtract[n] - mean, 2));
        }
    }


    // method to sum print values in any array passed into it
    static void printArray(int[] arrayToPrint){
        for(int k=0; k<arrayToPrint.length; k++){
            System.out.println(arrayToPrint[k]);
        }
    }


    // method to sum up values in any 2 arrays passed
    static double calculateSumCor(int[] array1, int[] array2){
        double sum = 0;
        for(int i=0; i<array1.length; i++){
            sum = sum + (array1[i] * array2[i]);
        }
        return sum;
    }

}
