import java.util.Scanner;
public class BodyMass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your weight");
        weight = input.nextInt();
        System.out.println("Enter your height");
        height = input.nextInt();
        bmi = weight/(height * height);
        if(bmi >= 30){
            System.out.println("Obese");
            System.out.println("Try to loose 11kgm^-2");
        }else if(bmi >=25 && bmi<30){
            System.out.println("overweight");
            System.out.println("Try to loose about 7kgm^-2");
        }else if(bmi <= 18) {
            System.out.println("BMI is the normal range");
        }else
            System.out.println("Done");

            }
        }

