public class Rectangle {
    private double leftX;
    private double leftY;
    private double width;
    private double height;

    public Rectangle(){}

    public void initialize(double lx, double ly, double w, double h){
        this.leftX = lx;
        this.leftY = ly;
        this.width = w;
        this.height = h;
    }
    public void initialize(double lx, double ly){
        this.leftX = lx;
        this.leftY = ly;
        this.width = 1;
        this.height = 1;
    }
    public void initialize(double lx, double ly, double w){
        this.leftX = lx;
        this.leftY = ly;
        this.width = w;
        this.height = w;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLeftX(double leftX) {
        this.leftX = leftX;
    }

    public void setLeftY(double leftY) {
        this.leftY = leftY;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLeftX() {
        return leftX;
    }

    public double getLeftY() {
        return leftY;
    }
}
