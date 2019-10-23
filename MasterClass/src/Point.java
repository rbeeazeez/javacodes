//to calculate distance between two points

public class Point {

    //instance variables
    private int x;
    private int y;

    //constructors
    public Point(){
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return (Math.sqrt (this.x * this.x) + (this.y * this.y));
    }

}
