package shapes;

public class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String getName() {
        return "Circle";
    }
}
