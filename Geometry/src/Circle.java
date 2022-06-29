public class Circle {
    private double centerX;
    private double centerY;
    private double radius;
    private double width;
    private String color;

    public Circle(){}
    public Circle(double x, double y){
        this.centerX = x;
        this.centerY = y;
        this.radius = 1;
        this.width = 1.1;
        this.color = "Black";
    }
    public Circle(double x, double y, double r){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = 1.1;
        this.color = "Black";
    }
    public Circle(double x, double y, double r, double width){
        this.initialize(x, y, r);
        this.width = width;
        this.color = "Black";

    }
    public Circle(double x, double y, double r, double width, String color){
        this.initialize(x, y, r, width);
        this.color = color;
    }


    public void initialize(double x, double y, double r){
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = 1.1;
        this.color = "Black";
    }
    public void initialize(double x, double y, double r, double width){
        this.initialize(x, y, r);
        this.width = width;
        this.color = "Black";

    }
    public void initialize(double x, double y, double r, double width, String color){
        this.initialize(x, y, r, width);
        this.color = color;
    }

    public void setCenterX(double centerX) {
        this.centerX = centerX;
    }

    public void setCenterY(double centerY) {
        this.centerY = centerY;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public String getColor() {
        return color;
    }

    public double getCenterX() {
        return centerX;
    }

    public double getCenterY() {
        return centerY;
    }

    public double getRadius() {
        return radius;
    }

    public double getWidth() {
        return width;
    }
}
