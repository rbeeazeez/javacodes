import java.util.Scanner;

public class MatrixComputation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the rows and columns for matrix A: ");
        int rowA = input.nextInt();
        int columnA = input.nextInt();
        System.out.println("Enter elements for matrix A");
        //reading in data for matrix A
        int[][] matrixA = new int[rowA][columnA];
        //System.out.println("Enter elements for matrix A");
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }
        //printing out elements in matrix A
        System.out.println("Elements in matrix A are");
        for(int[] matrix:matrixA){
            for( int p = 0; p < matrix.length; p++){
                System.out.printf("%d ", matrix[p]);
            }
            System.out.println("\n");
        }

        System.out.println("Enter the rows and column for matrix B");
        int rowB = input.nextInt();
        int columnB = input.nextInt();
        System.out.println("Enter elements for matrix B");
        //reading in data for matrix B
        int[][] matrixB = new int[rowB][columnB];
        //System.out.println("Enter elements for matrix B");
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        //printing out elements in matrix B
        System.out.println("Elements in matrix B are");
        for(int[] matrixL:matrixB){
            for( int p = 0; p < matrixL.length; p++){
                System.out.printf("%d ", matrixL[p]);
            }
            System.out.println("\n");
        }
    }
}
