
import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileImplementation {
    static int numberOfAdmittableStudents;
    static int numberOfConderableStudents;
    static int numberOfFailedStudents;
    static int numberOf0to20Students;
    static int numberOf21to40Students;
    static int numberOf41to49Students;
    static int numberOf50to80Students;

    static String result = "";
    static ArrayList<int[]> passers = new ArrayList<>();
    static ArrayList<String> passersStringData = new ArrayList<>();
    static ArrayList<String> failersStringData = new ArrayList<>();
    static ArrayList<int[]> failers = new ArrayList<>();
    static ArrayList<int[]> consider = new ArrayList<>();
    static ArrayList<int[]> range0_20 = new ArrayList<>();
    static ArrayList<int[]> range21_40 = new ArrayList<>();
    static ArrayList<int[]> range41_49 = new ArrayList<>();
    static ArrayList<int[]> range50_80 = new ArrayList<>();

    static int count = 1;
    static BufferedReader br;
    static FileWriter myWriter;
    static String[] lines;

    public static void main(String[] args) {
        readInputFile();
        sortStatistics();

        result += "Number of Students: " + (lines.length - 1) + "\n\n";

        result += "Number of Admittable Students with full data: " + numberOfAdmittableStudents + "\n";
        calculateFullStatistics(passersStringData);


        result += "Number of Failed Students with full data: " + numberOfFailedStudents + "\n";
        calculateFullStatistics(failersStringData);

        result += "Number of Students That Might Be Considered For Admission: " + numberOfConderableStudents + "\n";
        calculateStatistics(consider);

        result += "Number of Students In Range of 0 - 20: " + numberOf0to20Students + "\n";
        calculateStatistics(range0_20);

        result += "Number of Students In Range of 21 - 40: " + numberOf21to40Students + "\n";
        calculateStatistics(range21_40);

        result += "Number of Students In Range of 41 - 49: " + numberOf41to49Students + "\n";
        calculateStatistics(range41_49);

        result += "Number of Students In Range of 50 - 80: " + numberOf50to80Students + "\n";
        calculateStatistics(range50_80);

        writeOutputFileAndClose();
    }

    static void checkMeanScores(int[] scores, String data) {
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double mean = (double) sum / scores.length;
        if (mean >= 50.0) {
            passersStringData.add(data);
            numberOfAdmittableStudents++;
        } else {
            failersStringData.add(data);
            numberOfFailedStudents++;
        }

        if (mean >= 48 && mean <= 49) {
            consider.add(scores);
            numberOfConderableStudents++;
        }

        if (mean >= 0 && mean <= 20) {
            range0_20.add(scores);
            numberOf0to20Students++;
        } else if (mean >= 21 && mean <= 40) {
            range21_40.add(scores);
            numberOf21to40Students++;
        } else if (mean >= 41 && mean <= 49) {
            range41_49.add(scores);
            numberOf41to49Students++;
        } else if (mean >= 50 && mean <= 80) {
            range50_80.add(scores);
            numberOf50to80Students++;
        } else {
        }
    }

    static void readInputFile() {
        try {
            br = new BufferedReader(new FileReader("/home/rbeeazeez/IdeaProjects/Files/src/data.dat"));
            lines = Files.readAllLines(new File("/home/rbeeazeez/IdeaProjects/Files/src/data.dat").toPath()).toArray(new String[0]);
            System.out.println("File read successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeOutputFileAndClose() {
        try {
            myWriter = new FileWriter("/home/rbeeazeez/IdeaProjects/Files/src/out.txt");
            myWriter.write(result);
            myWriter.close();
            System.out.println("File written and closed successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void calculateStatistics(ArrayList<int[]> arrayToCalculate){
        for(int i = 0; i < arrayToCalculate.size(); i++) {
            int[] scores = arrayToCalculate.get(i);
            for (int j = 0; j < scores.length; j++) {
                result += scores[j] + " ";
            }
            result += "\n";
        }
        result += "\n\n";
    }

    static void calculateFullStatistics(ArrayList<String> arrayToCalculate){
        for(int i = 0; i < arrayToCalculate.size(); i++) {
            result += arrayToCalculate.get(i);
            result += "\n";
        }
        result += "\n\n";
    }

    static void sortStatistics(){
        for (String line : lines) {
            String[] columns = line.split(" ");
            if (count == 1) {
                count++;
            } else {
                int[] scores = new int[10];
                for (int i = 4; i < columns.length; i++) {
                    scores[i - 4] = Integer.parseInt(columns[i]);
                }
                checkMeanScores(scores, line);
            }
        }
    }
}
