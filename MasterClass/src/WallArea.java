public class WallArea {

    //instance variables
    private double width;
    private double height;

    //constructors
    public WallArea(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public WallArea(){
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0){
            this.height = 0;
        }
        this.height = height;
    }
    public double getArea(){
        double v = this.height * this.width;
        return v;
    }

}
