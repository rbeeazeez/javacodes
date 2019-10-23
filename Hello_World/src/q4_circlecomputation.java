import java.util.Scanner;
public class q4_circlecomputation {
    public static void main(String[]Args){
        Scanner input = new Scanner(System.in);
        int radius;
        double Area;
        double circumference;
        System.out.println("Enter an integer as radius: ");
        radius = input.nextInt();
        System.out.println("The Area is: " + Math.PI * radius * radius );
        System.out.println("The circumference is: " + 2 * Math.PI * radius);
    }

}
