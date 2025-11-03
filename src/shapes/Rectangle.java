package shapes;

public class Rectangle extends Shape {
    private double x;
    private double y;

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return x * y;
    }

    public String getName() {
        return "Rectangle";
    }
}
