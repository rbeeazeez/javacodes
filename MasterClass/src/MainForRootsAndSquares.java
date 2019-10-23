import java.util.*;

public class MainForRootsAndSquares {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Enter the endpoint of which the square, square root, cube and cube root is to be " +
                "determined: ");
        int n = input.nextInt ();

        System.out.println ("N\t\tNsq\t\tNSqroot\t\tNcube\t\tNCuberoot");
        RootsAndSquares rootsAndSquares = new RootsAndSquares (n);
        for (int i = 1; i <= n; i++){
            double square = RootsAndSquares.getSquare(i);
            double squareRoot = RootsAndSquares.getSquareRoot(i);
            double cube = RootsAndSquares.getCube (i);
            double cubeRoot = RootsAndSquares.getCubeRoot (i);

            System.out.printf ("%d\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n" ,i ,square, squareRoot, cube, cubeRoot);
        }
    }
}
