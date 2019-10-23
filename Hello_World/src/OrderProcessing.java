import java.util.Scanner;

public class OrderProcessing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continueInput = true;
        int totalAmountSold = 0;

        while (continueInput) {
            System.out.println("Enter product number. enter 0 to exit: ");
            int productNumber = input.nextInt();
            switch (productNumber) {
                case 1:
                    System.out.println("Product 1 selected");
                    totalAmountSold += 1200;
                    break;
                case 2:
                    System.out.println("Product 2 selected");
                    totalAmountSold += 1600;
                    break;
                case 3:
                    System.out.println("Product 3 selected");
                    totalAmountSold += 4000;
                    break;
                case 4:
                    System.out.println("Product 4 selected");
                    totalAmountSold += 2000;
                    break;
                case 5:
                    System.out.println("Product 5 selected");
                    totalAmountSold += 2100;
                    break;
                case 0:
                    System.out.println("Goodbye");
                    continueInput = false;
                    break;
                default:
                    System.out.println("Number out of range.... Please try again");
            }
        }
        System.out.println("Total price of Items sold is " + totalAmountSold);
    }
}
