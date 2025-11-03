package shapes;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double a;
    private double gamma;

    public Triangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.gamma = 90;
    }

    public Triangle(double a, double b, double gamma) {
        this.a = a;
        this.b = b;
        this.gamma = gamma;
    }

    public double getArea() {
        return a * b * Math.sin(Math.toRadians(gamma)) / 2;
    }

    public String getName() {
        return "Triangle";
    }
}
