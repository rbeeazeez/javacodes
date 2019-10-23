public class RootsAndSquares {
    private int number;

    public RootsAndSquares(int number) {
        this.number = number;
    }

    public static double getSquare(int number){
        double square = number * number;
        return square;
    }

    public static double getSquareRoot(int number){
        double squareRoot = Math.sqrt (number);
        return squareRoot;
    }

    public static double getCube(int number){
        double cube = number * number * number;
        return cube;
    }

    public static double getCubeRoot(int number){
        double cubeRoot = Math.cbrt (number);
        return cubeRoot;
    }

}
